package lesson56;

import java.util.ArrayList;
import java.util.Arrays;

public class My56Project {
    public static void main(String[] args) {
      ArrayList<Student> students = new ArrayList<>();
      students.add(new Student("Павел", new int[]{5,4,3,2,5,4}));
      students.add(new Student("Светлана", new int[]{3,2,4,3,2,4,3}));
      students.add(new Student("Евгения", new int[]{5,4,5,5,4,4,3}));
      System.out.println(students.stream().map((s)-> Arrays.stream(s.grades).average().getAsDouble()).reduce((a1, a2)->a1+a2).get()/students.size());
    }
}
class Student {
    String name;
    int [] grades;
    public Student(String name, int [] grades) {
        this.name = name;
        this.grades = grades;
    }
}
