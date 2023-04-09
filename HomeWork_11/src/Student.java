import java.util.ArrayList;

public class Student {
    String name;
    int age;
    ArrayList<Integer> grades;
    University university;

    public Student(String name, int age, ArrayList<Integer> grades, University university) {
        this.name = name;
        this.age = age;
        this.grades = grades;
        this.university = university;
    }
}
