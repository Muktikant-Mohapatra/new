import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student student1=new Student("kanha","1");
        Student student2=new Student("kanha","1");
        Set<Student> students=new LinkedHashSet<>();
        students.add(student1);
        students.add(student2);
        System.out.println(students);
    }
}
