package practise.url_shortener.repository;

import java.util.concurrent.ConcurrentHashMap;

public class UrlRepository {

    private final ConcurrentHashMap<String, String> shortToLong = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<String, String> longToShort = new ConcurrentHashMap<>();

    public void save(final String shortUrl, final String longUrl) {
        shortToLong.put(shortUrl, longUrl);
        longToShort.put(longUrl, shortUrl);
    }

    public String getLongUrl(final String shortUrl) {
        return shortToLong.get(shortUrl);
    }

    public String getShortUrl(final String longUrl) {
        return longToShort.get(longUrl);
    }
}
