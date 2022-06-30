import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try(ServerSocket server = new ServerSocket(8080)){
            System.out.println("正在等待客户端连接");
            Socket socket = server.accept();       //当没有客户端连接时，线程会阻塞，直到有客户端连接为止
            socket.setSoTimeout(3000);      //IO超时时间
            System.out.println("客户端已连接，IP地址为："+socket.getInetAddress().getHostAddress());
            System.out.println("读取客户端数据：");
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            System.out.println(reader.readLine());

            OutputStreamWriter writer = new OutputStreamWriter(socket.getOutputStream());
            writer.write("收到\n");
            writer.flush();

            socket.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
