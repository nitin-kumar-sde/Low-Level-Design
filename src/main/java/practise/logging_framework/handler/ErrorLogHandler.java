package practise.logging_framework.handler;

import practise.logging_framework.destination.LogDestination;

import java.util.List;

public class ErrorLogHandler extends AbstractLogHandler {

    private static final String ERROR_LOG_HANDLER = "ERROR: ";

    public ErrorLogHandler(List<LogDestination> destinations) {
        super(destinations);
    }

    @Override
    protected String getLogLevel() {
        return ERROR_LOG_HANDLER;
    }
}
