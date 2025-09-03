package design_patterns.structural.adapter;

import design_patterns.structural.adapter.adapters.DataExporter;

public class Main {

    public static void main(String[] args) {
        String reportData = "Daily sales: 500 units";

        DataExporter csv = ExporterFactory.getExporter("csv");
        csv.export(reportData);

        DataExporter json = ExporterFactory.getExporter("json");
        json.export(reportData);

        DataExporter xml = ExporterFactory.getExporter("xml");
        xml.export(reportData);
    }
}
