package practise.url_shortener.service;


import practise.url_shortener.encoder.Base62Encoder;
import practise.url_shortener.exceptions.URLNotMappedException;
import practise.url_shortener.repository.UrlRepository;

import java.util.concurrent.atomic.AtomicLong;

public class UrlShortenerService {

    private final UrlRepository repository = new UrlRepository();
    private final AtomicLong counter = new AtomicLong(1); // auto increment id
    private final String DOMAIN = "http://short.ly/";

    public String shortenUrl(final String longUrl) {
        // If already shortened, return it
        String existingShort = repository.getShortUrl(longUrl);

        if (existingShort != null) {
            return DOMAIN + existingShort;
        }

        // Generate new short code
        Long id = counter.getAndIncrement();
        String shortCode = Base62Encoder.encode(id);

        repository.save(shortCode, longUrl);
        return DOMAIN + shortCode;
    }

    public String expandUrl(final String shortUrl) {

        String code = shortUrl.replace(DOMAIN, "");
        try {
            return repository.getLongUrl(code);

        }
        catch (Exception exception) {
            throw new URLNotMappedException(shortUrl +" is not mapped, please map it first");
        }
    }
}
