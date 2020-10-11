package Domain;

public class Student {
private String name;
private int roll;
private String standard;
private Marksheet marksheet;

    public Student(String name, int roll, String standard, Marksheet marksheet) {
        this.name = name;
        this.roll = roll;
        this.standard = standard;
        this.marksheet = marksheet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public Marksheet getMarksheet() {
        return marksheet;
    }

    public void setMarksheet(Marksheet marksheet) {
        this.marksheet = marksheet;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", roll=" + roll +
                ", standard='" + standard + '\'' +
                ", marksheet=" + marksheet +
                '}';
    }
}
