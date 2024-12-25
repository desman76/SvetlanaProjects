package lesson47;

import java.util.TreeSet;

public class My471Project {
    public static void main(String[] args) {
        TreeSet<Student> treeSet = new TreeSet<>();
        treeSet.add(new Student ("Эльвира", 5));
        treeSet.add(new Student ("Гульназ", 3));
        treeSet.add(new Student ("Марат", 2));
        treeSet.add(new Student ("Кристина", 4));
        treeSet.add(new Student ("Наталья", 5));
        treeSet.add(new Student ("Михайл", 4));
        System.out.println(treeSet);
    }
}
class Student implements Comparable<Student> {
    String name;
    int grade;
    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }
    @Override
    public int compareTo(Student o) {
        return grade - o.grade;
    }
    @Override
    public String toString() {
        return "{name='" + name + '\'' + ", grade=" + grade + "}\n";
    }
}
