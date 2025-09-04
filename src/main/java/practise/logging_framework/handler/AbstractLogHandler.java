package practise.logging_framework.handler;

import practise.logging_framework.destination.LogDestination;

import java.util.List;

public abstract class AbstractLogHandler implements LogHandler {

    private List<LogDestination> destinations;

    public AbstractLogHandler(List<LogDestination> destinations) {
        this.destinations = destinations;
    }

    @Override
    public void log(String message) {
        for(LogDestination logDestination : destinations) {
        logDestination.writeLog(getLogLevel() + ": " + message);
        }
    }

    protected abstract String getLogLevel();
}
