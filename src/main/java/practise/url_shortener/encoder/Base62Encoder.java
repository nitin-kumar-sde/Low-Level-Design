package practise.url_shortener.encoder;

public class Base62Encoder {

    private static final String CHARACTERS = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    private static final int BASE = CHARACTERS.length();

    public static String encode(Long num) {
        StringBuilder sb = new StringBuilder();
        while (num > 0) {
            sb.append(CHARACTERS.charAt((int) (num % BASE)));
            num /= BASE;
        }
        return sb.reverse().toString();
    }
}

