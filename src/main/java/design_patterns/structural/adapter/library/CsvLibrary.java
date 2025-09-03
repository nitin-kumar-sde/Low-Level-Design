package design_patterns.structural.adapter.library;

/**
 * Adaptee class which provides CSV export functionality
 */

public class CsvLibrary {

    public void writeCsv(String content) {
        System.out.println("[CSV] Exported: " + content);
    }
}

