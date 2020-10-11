package Domain;

import java.util.Comparator;

public class ChemSort implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getMarksheet().getChemMark() - o2.getMarksheet().getChemMark();
    }

}
