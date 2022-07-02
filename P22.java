import java.sql.*;

public class P22 {
    public static void main(String[] args) {
        //1、通过DriverManager来获得数据库连接
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/study", "root", "123456");
             //2、创建一个用于执行SQL的Statement对象
            Statement statement = connection.createStatement()){
            //3、执行SQL语句，并得到结果
            ResultSet set = statement.executeQuery("select * from student");
            //4、查看结果
            while(set.next()){
                System.out.println(set.getString(1));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        //5、释放资源，try-with-resource语法会自动帮助我们close
    }
}
