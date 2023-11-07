package org.example;

public class LogHandlerError extends LogHandler{

    public LogHandlerError (LogHandler superior){
        listaLogs.add(LogLevelError.getInstance());
        this.setLogHandlerSuperior(superior);
    }
    @Override
    public String getDescricaoHandler() {
        return "Error handler";
    }
}
