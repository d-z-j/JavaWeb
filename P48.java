import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class P48 {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("test.properties"));
        System.out.println(properties.getProperty("name"));
        properties.store(System.out,"test message");

        System.getProperties().forEach((k,v)-> System.out.println(k+":"+v));
    }
}
