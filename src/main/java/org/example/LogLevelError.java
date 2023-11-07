package org.example;

public class LogLevelError implements LogLevel{
    private static LogLevelError logLevelError = new LogLevelError();

    private LogLevelError(){}

    public static LogLevelError getInstance(){
        return logLevelError;
    }
}
