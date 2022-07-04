import entity.Student;
import mapper.TestMapper;
import org.apache.ibatis.session.SqlSession;

import java.io.FileNotFoundException;

public class P38 {
    public static void main(String[] args) throws FileNotFoundException {
        //直接利用工具类创建SqlSession，设置自动提交开启
        try(SqlSession session = MybatisUtil.getSession(true)) {
            //session.getMapper获取接口的实现类，用接口创建的对象接收
            //此处实现类是由mybatis动态生成的
            TestMapper mapper = session.getMapper(TestMapper.class);
            //就可以用创建好的对象，调用接口里面的方法
            System.out.println(mapper.getStudentBySid(2));
        }
    }
}
