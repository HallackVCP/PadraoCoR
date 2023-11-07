import org.example.Log;
import org.example.LogHandlerError;
import org.example.LogHandlerInfo;
import org.example.LogHandlerWarning;
import org.example.LogLevelError;
import org.example.LogLevelFatal;
import org.example.LogLevelInfo;
import org.example.LogLevelWarning;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LogTest {
    LogHandlerError handlerError;
    LogHandlerWarning handlerWarning;
    LogHandlerInfo handlerInfo;


    @BeforeEach
    void setUp() {
        handlerError = new LogHandlerError(null);
        handlerWarning = new LogHandlerWarning(handlerError);
        handlerInfo = new LogHandlerInfo(handlerWarning);
    }

    @Test
    void deveRetornarInfoHandlerParaLogDeInfo() {
        assertEquals("Info handler", handlerInfo.handleLog(new Log(LogLevelInfo.getInstance())));
    }

    @Test
    void deveRetornarWarningHandlerParaLogDeWarning() {
        assertEquals("Warning handler", handlerInfo.handleLog(new Log(LogLevelWarning.getInstance())));
    }

    @Test
    void deveRetornarErrorHandlerParaLogDeErro() {
        assertEquals("Error handler", handlerInfo.handleLog(new Log(LogLevelError.getInstance())));
    }


    @Test
    void deveRetornarSemHandlerParaNivelDeLog() {
        assertEquals("Sem handler para log desse nivel", handlerInfo.handleLog(new Log(LogLevelFatal.getInstance())));
    }
}
