package entity;

import lombok.Data;
import lombok.experimental.Accessors;
import org.apache.ibatis.type.Alias;

@Data
@Accessors(chain = true)
//为实体类取别名，简化映射器中resultType内容的书写
//@Alias("lbwnb")
public class Student {
    int sid;
    String name;
    String sex;
    Teacher teacher;
}
