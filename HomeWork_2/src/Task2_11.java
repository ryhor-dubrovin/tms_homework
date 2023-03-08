import java.util.Scanner;

//Определить, является ли число простым
public class Task2_11 {
    public static void main(String[] args) {

        System.out.print("Введите число - ");

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int counter = 0;

        for (int i = 1; i < num+1; i++) {
            if (num % i == 0) counter++;
        }

        if (counter > 2) System.out.println("Число не простое");
        else System.out.println("Число простое");

    }
}
