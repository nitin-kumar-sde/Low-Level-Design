package design_patterns.structural.adapter.library;

/**
 * Adaptee class which provides XML export functionality
 */
public class XmlLibrary {
    public void writeXml(String content) {
        System.out.println("<exported>" + content + "</exported>");
    }
}
