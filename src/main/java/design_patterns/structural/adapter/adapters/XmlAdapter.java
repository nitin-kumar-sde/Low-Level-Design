package design_patterns.structural.adapter.adapters;

import design_patterns.structural.adapter.library.XmlLibrary;

/**
 * Adapter class which allows exporting data in XML format.
 */
public class XmlAdapter implements DataExporter {
    private final XmlLibrary xmlLibrary = new XmlLibrary();

    @Override
    public void export(String data) {
        xmlLibrary.writeXml(data);
    }
}
