import java.util.ArrayList;

public class University {
    String name;
    ArrayList<Student> students;
    double rate;

    public University(String name, ArrayList<Student> students) {
        this.name = name;
        this.students = students;
    }

    public double getRate() {
        return rate;
    }
}
