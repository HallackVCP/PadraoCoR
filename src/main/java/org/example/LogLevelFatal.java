package org.example;

public class LogLevelFatal implements LogLevel{

    private static LogLevelFatal logLevelFatal = new LogLevelFatal();

    private LogLevelFatal(){}

    public static LogLevelFatal getInstance(){
        return logLevelFatal;
    }
}
