import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@Setter
@Getter
@ToString
@Accessors(chain = true)
@AllArgsConstructor
public class Student {
    @ToString.Include(rank = 2,name = "学号")
    Integer sid;
    @ToString.Include(rank = 1,name = "姓名")
    String name;
    @ToString.Include(rank = 0,name = "性别")
    String sex;

}
