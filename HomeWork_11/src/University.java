import java.util.ArrayList;

public class University {
    String name;
    ArrayList<Student> students = new ArrayList<>();
    double rate;


    public University(String name) {
        this.name = name;
    }

    public void addStudent(Student student) {
        students.add(student);
        student.setUniversity(this);
    }

    private void delStudent(Student student) {
        students.remove(student);
        students.trimToSize();
    }
    public double getUniversityRate() {

        double rate = 0.0;
        for (int i = 0; i < students.size(); i++) {
            rate += students.get(i).getGradesAverage();
        }
        return rate / students.size();
    }
    public void findStudentByName(String name) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getName() == name) {
                System.out.println("====================");
                System.out.println("Name: " + students.get(i).getName());
                System.out.println("Age: " + students.get(i).getAge());
                System.out.println("University: " + this.name);
                System.out.println("Grades Average: " + students.get(i).getGradesAverage());
                System.out.println("====================");
            }
        }
    }
    public void expelStudent (Student s) {
        s.delUniversity();
    }

}
