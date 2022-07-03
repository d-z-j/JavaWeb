import entity.Student;
import mapper.TestMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.SqlSession;

import java.io.FileNotFoundException;
import java.util.List;

public class P38 {
    public static void main(String[] args) throws FileNotFoundException {
        try(SqlSession session = MybatisUtil.getSession(true)) {
            TestMapper mapper = session.getMapper(TestMapper.class);
            System.out.println(mapper.deleteStudent(1940618806));
        }
    }
}
