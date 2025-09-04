package practise.logging_framework;

import practise.logging_framework.destination.DataBaseLogDestination;
import practise.logging_framework.destination.FileLogDestination;
import practise.logging_framework.handler.ErrorLogHandler;
import practise.logging_framework.handler.InfoLogHandler;
import practise.logging_framework.handler.LogHandler;
import practise.logging_framework.handler.WarnLogHandler;

import java.util.List;

public class LogHandlerFactory {

    public static LogHandler getLogHandler(String logLevel) {

        if("INFO".equals(logLevel))
            return new InfoLogHandler(
                    List.of( new DataBaseLogDestination(),
                            new FileLogDestination()));

        else if("WARN".equals(logLevel))
            return new WarnLogHandler(
                    List.of( new DataBaseLogDestination(),
                            new FileLogDestination()));


        else if("ERROR".equals(logLevel))
            return new ErrorLogHandler(
                    List.of( new DataBaseLogDestination(),
                            new FileLogDestination()));

        else
            throw new IllegalArgumentException("Invalid log level: " + logLevel);
    }
}
