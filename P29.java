import java.sql.*;
import java.util.Scanner;

public class P29 {
    public static void main(String[] args) {
        try(Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/study", "root", "123456");
            Statement statement = connection.createStatement()
            ){
            connection.setAutoCommit(false);

            statement.executeUpdate("insert into study.user values ('a',123)");

            Savepoint savepoint =connection.setSavepoint();
            statement.executeUpdate("insert into study.user values ('b',123)");
            statement.executeUpdate("insert into study.user values ('c',123)");

            connection.rollback(savepoint);
            connection.commit();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
