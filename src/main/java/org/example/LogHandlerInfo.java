package org.example;

public class LogHandlerInfo extends LogHandler{

    public LogHandlerInfo(LogHandler superior){
        listaLogs.add(LogLevelInfo.getInstance());
        this.setLogHandlerSuperior(superior);
    }
    @Override
    public String getDescricaoHandler() {
        return "Info handler";
    }
}
