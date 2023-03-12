import java.util.Random;
import java.util.Scanner;
public class Computer {
    String name;
    String chip;
    int ram;
    int hardDrive;
    int resource;
    boolean status = false; // состояние комп, вкл/выкл
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    public Computer(String name,String chip, int ram, int hardDrive, int resource) {
        this.name = name;
        this.chip = chip;
        this.ram = ram;
        this.hardDrive = hardDrive;
        this.resource = resource;
    }
    public void getInfo() {
        System.out.println("================================");
        System.out.println("Модель компьютера - " + name);
        System.out.println("- процессор - " + chip);
        System.out.println("- объем оперативной памяти - " + ram);
        System.out.println("- объем жесткого диска - " + hardDrive);
        System.out.println("- ресурс - " + resource);
        System.out.println("================================");
    }
    public void turnOn() {

        if (resource > 0) {
            System.out.println("Включение компьютера ...");
            System.out.println("Чтобы компьютер не сгорел угадайте число: 0 или 1?");
            int num = scanner.nextInt();
            int r = random.nextInt(2);

            if (num == r) {
                status = true;
                System.out.println("Компьютер успешно включен!");
            } else {
                resource = 0;
                System.out.println("Компьютер сгорел =(");
            }
        } else {
            System.out.println("Компьютер сгорел =(");
        }

    }
    public void turnOff() {
        if (status) {
            System.out.println("Компьютер выключен.");
            resource--;
            status = false;
        } else {
            System.out.println("(－ω－) zzZ");
        }
    }

}
