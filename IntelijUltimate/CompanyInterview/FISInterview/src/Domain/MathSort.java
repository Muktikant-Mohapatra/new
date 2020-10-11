package Domain;

import java.util.Comparator;

public class MathSort implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getMarksheet().getMathMark() - o2.getMarksheet().getMathMark();
    }

}
