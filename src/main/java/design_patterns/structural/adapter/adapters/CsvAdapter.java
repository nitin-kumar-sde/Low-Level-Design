package design_patterns.structural.adapter.adapters;

import design_patterns.structural.adapter.library.CsvLibrary;

/**
 * Adapter class which allows CsvLibrary to be used as a DataExporter
 */

public class CsvAdapter implements DataExporter {
    private final CsvLibrary csvLibrary = new CsvLibrary();

    @Override
    public void export(String data) {
        csvLibrary.writeCsv(data);
    }
}
