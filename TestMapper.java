package mapper;

import java.util.List;
import java.util.Map;

import entity.Student;
import entity.Teacher;
//定义与映射器关联的接口，可以明确映射返回的类型
//利用接口可以使用注解进行开发
public interface TestMapper {
    //明确 selectStudent 方法的返回类型为 List<Student>
    List<Student> selectStudent();

    Student getStudentBySid(int sid);

    //插入一条学生信息，返回值为int，表示有多少行生效
    int addStudent(Student student);

    int deleteStudent(int sid);

    Teacher getTeacherByTid(int tid);

    List<Student> selectStudent1(int tid);
}
