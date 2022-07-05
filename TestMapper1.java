package mapper;

import entity.Student;
import entity.Teacher;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface TestMapper1 {
    //使用注解开发
    @Insert("insert into study.student(sid,name,sex) values(#{sid},#{name},#{sex})")
    int addStudent(Student student);

    //@Results 自定义映射关系
    @Results({
            @Result(column = "sid", property = "sid"),
            @Result(column = "name", property = "sex"),
            @Result(column = "sex", property = "name"),
    })
    @Select("select * from study.student where sid=#{sid}")
    Student getStudentBySid(int sid);


    @Results({
            @Result(column = "tid",property = "tid"),
            @Result(column = "name",property = "name"),
            @Result(column = "tid",property = "studentList",many =
                @Many(select = "getStudentByTid")),
    })
    @Select("select * from teacher where tid = #{tid}")
    Teacher getTeacherByTid(int sid);

    @Select("select * from student inner join teach on student.sid = teach.sid where tid = #{tid}")
    List<Student> getStudentByTid(int tid);
}
