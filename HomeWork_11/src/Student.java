import java.util.ArrayList;

public class Student {
    private String name;
    private int age;
    private ArrayList<Integer> grades = new ArrayList<>();
    private University university;

    public Student(String name, int age, University university) {
        this.name = name;
        this.age = age;
        this.university = university;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public University getUniversity() {
        return university;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double getGradesAverage() {
        double sum = 0.0;
        for (int i = 0; i < grades.size(); i++) {
            sum += grades.get(i);
        }
        return sum / grades.size();
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    public void delUniversity (){
        this.university = null;

    }
    public void getInfo() {
        System.out.println("====================");
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("University: " + this.university);
        System.out.println("Grades Average: " + this.getGradesAverage());
        System.out.println("====================");
    }
}
