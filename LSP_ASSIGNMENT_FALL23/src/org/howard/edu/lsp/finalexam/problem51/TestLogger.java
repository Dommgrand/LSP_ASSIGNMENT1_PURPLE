package org.howard.edu.lsp.finalexam.problem51;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestLogger {

    @Test
    public void testDisplayLog() {
        Logger logger = Logger.getInstance();
        logger.logMessage("Test message");
        assertEquals("Log:\nTest message\n", logger.displayLog());
    }

    @Test
    public void testLoggerInstances() {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();
        assertSame(logger1, logger2); // Verifies if logger1 and logger2 refer to the same instance
    }
}
