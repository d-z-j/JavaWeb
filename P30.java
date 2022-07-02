public class P30 {
    public static void main(String[] args) {
        Student student = new Student(1,"小明","男");

        //@Accessors(chain = true) 实现链式调用
        student
                .setSid(2)
                .setName("小刚")
                .setSex("男");

        System.out.println(student.toString());
    }
}
