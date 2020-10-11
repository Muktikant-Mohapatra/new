package main;

import Domain.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class School {
    public static void main(String[] args) {
        Marksheet marksheet1=new Marksheet();
        marksheet1.setChemMark(50);
        marksheet1.setMathMark(90);
        marksheet1.setPhyMark(60);
        Marksheet marksheet2=new Marksheet();
        marksheet2.setChemMark(40);
        marksheet2.setMathMark(10);
        marksheet2.setPhyMark(80);
        Marksheet marksheet3=new Marksheet();
        marksheet3.setChemMark(80);
        marksheet3.setMathMark(100);
        marksheet3.setPhyMark(90);
        ArrayList<Student> students=new ArrayList<>();
        students.add(new Student("kanha",101,"5th",marksheet1));
        students.add(new Student("Saswat",102,"5th",marksheet2));
        students.add(new Student("Prabhu",103,"5th",marksheet3));

        for (int i=0;i<students.size();i++){
            System.out.println(students.get(i));
        }
        System.out.println("---------------------------------------------------------------");
        Collections.sort(students, new PhySort());
        for (int i=0;i<students.size();i++){
            System.out.println(students.get(i));
        }

    }
}
