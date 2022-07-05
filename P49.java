import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class P49 {
    public static void main(String[] args) throws IOException {
        LogManager manager = LogManager.getLogManager();
        manager.readConfiguration(new FileInputStream("test.properties"));

        Logger logger = Logger.getLogger(P49.class.getName());
        logger.log(Level.INFO,"我是日志消息");
    }
}
