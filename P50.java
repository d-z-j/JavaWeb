import lombok.extern.java.Log;

@Log(topic = "打工是不可能打工的")
public class P50 {
    public static void main(String[] args) {
        System.out.println(log.getName());
        log.info("我是日志信息");
    }
}
