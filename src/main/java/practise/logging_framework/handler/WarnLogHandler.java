package practise.logging_framework.handler;

import practise.logging_framework.destination.LogDestination;

import java.util.List;

public class WarnLogHandler extends AbstractLogHandler {

    private static final String WARN_LOG_LEVEL = "WARN: ";

    public WarnLogHandler(List<LogDestination> destinations) {
        super(destinations);
    }

    @Override
    protected String getLogLevel() {
        return WARN_LOG_LEVEL;
    }
}
