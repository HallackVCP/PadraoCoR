package org.example;

public class LogHandlerWarning extends LogHandler{

    public LogHandlerWarning (LogHandler superior){
        listaLogs.add(LogLevelWarning.getInstance());
        this.setLogHandlerSuperior(superior);
    }

    @Override
    public String getDescricaoHandler() {
        return "Warning handler";
    }
}
