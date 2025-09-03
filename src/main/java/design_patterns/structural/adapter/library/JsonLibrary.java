package design_patterns.structural.adapter.library;

/**
 * Adaptee class which provides JSON export functionality
 */

public class JsonLibrary {

    public void writeJson(String content) {
        System.out.println("{ \"exported\": \"" + content + "\" }");
    }
}
