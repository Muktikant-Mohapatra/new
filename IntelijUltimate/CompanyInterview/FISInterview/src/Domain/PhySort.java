package Domain;

import java.util.Comparator;

public class PhySort implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getMarksheet().getPhyMark() - o2.getMarksheet().getPhyMark();
    }

}
