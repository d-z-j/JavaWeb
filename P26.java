import java.sql.*;

public class P26 {
    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/study", "root", "1607980231..");
             Statement statement = connection.createStatement()){

            ResultSet set = statement.executeQuery("select * from Study.student");
            while (set.next()){
                Student student = new Student(set.getInt(1),set.getString(2), set.getString(3));
                student.say();
            }

        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}