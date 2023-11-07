package org.example;

public class Log {
    private LogLevel logLevel;

    public LogLevel getLogLevel() {
        return logLevel;
    }

    public Log(LogLevel logLevel) {
        this.logLevel = logLevel;
    }

    public void setLogLevel(LogLevel logLevel) {
        this.logLevel = logLevel;
    }
}
