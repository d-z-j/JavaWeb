import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class P6 {
    public static void main(String[] args) {
        try (ServerSocket server = new ServerSocket(8080)) {
            System.out.println("正在等待客户端连接");
            Socket socket = server.accept();
            System.out.println("客户端已连接，IP地址为："+socket.getInetAddress().getHostAddress());
            InputStream in = socket.getInputStream();
            System.out.println("接收到客户端数据：");
            while (true){
                int i = in.read();
                if (i == -1) break;
                System.out.println((char) i);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
