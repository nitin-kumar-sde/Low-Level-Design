package design_patterns.structural.adapter;

import design_patterns.structural.adapter.adapters.CsvAdapter;
import design_patterns.structural.adapter.adapters.DataExporter;
import design_patterns.structural.adapter.adapters.JsonAdapter;
import design_patterns.structural.adapter.adapters.XmlAdapter;

public class ExporterFactory {

    public static DataExporter getExporter(String type) {
        return switch (type.toLowerCase()) {

            case "csv" -> new CsvAdapter();

            case "json" -> new JsonAdapter();

            case "xml" -> new XmlAdapter();

            default -> throw new IllegalArgumentException("Unknown format: " + type);
        };
    }
}
