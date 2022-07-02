import java.sql.*;
import java.util.Scanner;

public class P27 {
    public static void main(String[] args) {
        try(Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/study", "root", "1607980231..");
            Statement statement = connection.createStatement();
            Scanner scanner = new Scanner(System.in)){

            String sql = "select * from study.user where username='"+scanner.nextLine()+"' and pwd='"+scanner.nextLine()+"';";
            System.out.println(sql);
            ResultSet set = statement.executeQuery(sql);
            while (set.next()){
                String username = set.getString(1);
                System.out.println(username+"登录成功!");
            }
        }catch (SQLException e){
            e.printStackTrace();
        }

    }
}
