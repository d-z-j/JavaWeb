import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
//工具类：用来集中创建SqlSession
public class MybatisUtil {
    private static SqlSessionFactory sqlSessionFactory;
    //静态代码块 类刚被加载时就会读取配置文件
    static {
        try {
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(new FileInputStream("mybatis-config.xml"));
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        }

    /**
     * 获取一个新的会话
     * @param autoCommit 是否开启自动提交
     * @return  SqlSession对象
     */
    public static SqlSession getSession(boolean autoCommit){
        return sqlSessionFactory.openSession(autoCommit);
    }
}
