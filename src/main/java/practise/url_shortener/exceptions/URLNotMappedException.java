package practise.url_shortener.exceptions;

public class URLNotMappedException extends RuntimeException {

    public URLNotMappedException(String message) {
        super(message);
    }
}
