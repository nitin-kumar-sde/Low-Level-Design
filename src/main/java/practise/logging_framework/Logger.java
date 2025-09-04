package practise.logging_framework;

import practise.logging_framework.handler.LogHandler;

/**
 * Logger class for logging messages.
 */
public class Logger {

    private static Logger logInstance;

    private Logger() {
    }

    public static Logger getLogInstance() {
        if (logInstance == null) {
            logInstance = new Logger();
        }
        return logInstance;
    }

    void info(final String message) {
        LogHandler info = LogHandlerFactory
                .getLogHandler("INFO");
        info.log(message);
    }

    void warn(String message) {
        LogHandler warn = LogHandlerFactory
                .getLogHandler("WARN");
        warn.log(message);
    }

    void error(String message) {
        LogHandler error = LogHandlerFactory
                .getLogHandler("WARN");
        error.log(message);
    }
}
