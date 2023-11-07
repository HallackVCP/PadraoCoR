package org.example;

public class LogLevelInfo implements LogLevel{
    private static LogLevelInfo logLevelInfo = new LogLevelInfo();

    private LogLevelInfo(){}

    public static LogLevelInfo getInstance(){
        return logLevelInfo;
    }
}
