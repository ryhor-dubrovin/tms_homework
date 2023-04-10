public class Main {
    public static void main(String[] args) {
        Student ryhor = new Student("Ryhor", 27);
        Student anton = new Student("Anton", 20);
        Student mikita = new Student("Mikita", 45);

        University BSU = new University("BSU");
        University BSUIR = new University("BSUIR");

        BSU.addStudent(ryhor);
        BSU.addStudent(mikita);
        BSUIR.addStudent(anton);

        ryhor.addGrade(10);
        mikita.addGrade(8);
        anton.addGrade(5);

        System.out.println("BSU rate: " + BSU.getUniversityRate());
        System.out.println("BSUIR rate: " + BSUIR.getUniversityRate());

        BSUIR.findStudentByName("Anton");
        BSUIR.expelStudent(anton);
        anton.getInfo();
    }

}