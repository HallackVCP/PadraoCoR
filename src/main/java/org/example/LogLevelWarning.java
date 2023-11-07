package org.example;

public class LogLevelWarning implements LogLevel{

    private static LogLevelWarning logLevelWarning = new LogLevelWarning();

    private LogLevelWarning(){}

    public static LogLevelWarning getInstance(){
        return logLevelWarning;
    }
}
