import java.sql.*;
import java.util.Scanner;

public class P28 {
    public static void main(String[] args) {
        try(Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/study", "root", "1607980231..");
            PreparedStatement statement = connection.prepareStatement("select * from study.user where username=? and pwd=?;");
            Scanner scanner = new Scanner(System.in)){

            statement.setString(1,scanner.nextLine());
            statement.setString(2,scanner.nextLine());

            System.out.println(statement.toString());
            ResultSet res = statement.executeQuery();
            while (res.next()){
                String username = res.getString(1);
                System.out.println(username+"登录成功");
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}