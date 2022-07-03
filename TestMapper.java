package mapper;

import java.util.List;
import entity.Student;

public interface TestMapper {
    List<Student> selectStudent();

    Student getStudentBySid(int sid);

    int addStudent(Student student);

    int deleteStudent(int sid);
}
