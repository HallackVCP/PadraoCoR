package org.example;

import java.util.ArrayList;

public abstract class LogHandler {

    protected ArrayList listaLogs = new ArrayList();
    private LogHandler logHandlerSuperior;

    public LogHandler getLogHandlerSuperior() {
        return logHandlerSuperior;
    }

    public void setLogHandlerSuperior(LogHandler logHandlerSuperior) {
        this.logHandlerSuperior = logHandlerSuperior;
    }

    public abstract String getDescricaoHandler();

    public String handleLog(Log log) {
        if (listaLogs.contains(log.getLogLevel())) {
            return getDescricaoHandler();
        }
        else {
            if (logHandlerSuperior != null) {
                return logHandlerSuperior.handleLog(log);
            }
            else
            {
                return "Sem handler para log desse nivel";
            }
        }
    }
}
