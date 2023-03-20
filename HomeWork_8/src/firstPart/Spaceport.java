package firstPart;

public class Spaceport {
    public void launch(IStart object) {
        if (!object.preStartCheck()) {
            System.out.println("Предстартовая проверка провалена");
        } else {
            object.engineStarting();
            for (int i = 1; i < 11; i++) {
                System.out.println(i + "...");
            }
            object.start();
        }
    }
}