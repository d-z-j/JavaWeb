import java.sql.*;

public class P25 {
    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/study", "root", "1607980231..");
             Statement statement = connection.createStatement()){
            //System.out.println(statement.executeUpdate("update Study.student set name='小芳' where sid=1940618805"));
            ResultSet set = statement.executeQuery("select * from Study.student");
            while (set.next()){
                System.out.println(set.getInt(1));
                System.out.println(set.getString(2));
                System.out.println(set.getString(3));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
