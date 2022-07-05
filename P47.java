import java.io.IOException;
import java.util.SimpleTimeZone;
import java.util.logging.*;

public class P47 {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(P47.class.getName());

        //修改日志级别
        logger.setLevel(Level.ALL);
        //不使用父日志处理器
        logger.setUseParentHandlers(false);
        //使用自定义日志处理器
        ConsoleHandler handler = new ConsoleHandler();
        handler.setLevel(Level.ALL);
        logger.addHandler(handler);

        //设置文件书写格式为简单
        SimpleFormatter formatter = new SimpleFormatter();
        //文件日志
        FileHandler fileHandler = new FileHandler("test.txt",true);
        fileHandler.setLevel(Level.WARNING);
        fileHandler.setFormatter(formatter);
        logger.addHandler(fileHandler);

        logger.info("我是一个日志信息");
        logger.log(Level.SEVERE,"出现了严重错误",new IOException("我就是错误"));
        logger.log(Level.WARNING,"警告的内容");
        logger.log(Level.INFO,"普通的信息");
        logger.log(Level.CONFIG,"级别低于普通信息");
    }
}
