package Domain;

import java.util.HashMap;
import java.util.Map;

public class Marksheet {
private int mathMark;
private int chemMark;
private int phyMark;

    public int getMathMark() {
        return mathMark;
    }

    public void setMathMark(int mathMark) {
        this.mathMark = mathMark;
    }

    public int getChemMark() {
        return chemMark;
    }

    public void setChemMark(int chemMark) {
        this.chemMark = chemMark;
    }

    public int getPhyMark() {
        return phyMark;
    }

    public void setPhyMark(int phyMark) {
        this.phyMark = phyMark;
    }

    @Override
    public String toString() {
        return "Marksheet{" +
                "mathMark=" + mathMark +
                ", chemMark=" + chemMark +
                ", phyMark=" + phyMark +
                '}';
    }
}
