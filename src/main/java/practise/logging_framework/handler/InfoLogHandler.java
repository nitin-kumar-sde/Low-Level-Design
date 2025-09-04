package practise.logging_framework.handler;

import practise.logging_framework.destination.LogDestination;

import java.util.List;

public class InfoLogHandler extends AbstractLogHandler {


    private static final String INFO_LOG_LEVEL = "INFO: ";

    public InfoLogHandler(List<LogDestination> destinations) {
        super(destinations);
    }

    @Override
    protected String getLogLevel() {
        return INFO_LOG_LEVEL;
    }
}
