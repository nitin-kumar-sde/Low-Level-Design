package design_patterns.structural.adapter.adapters;

import design_patterns.structural.adapter.library.JsonLibrary;

/**
 * Adapter class which makes JsonLibrary compatible with DataExporter interface
 */
public class JsonAdapter implements DataExporter {
    private final JsonLibrary jsonLibrary = new JsonLibrary();

    @Override
    public void export(String data) {
        jsonLibrary.writeJson(data);
    }
}

