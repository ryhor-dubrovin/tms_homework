import java.util.Scanner;
//Составьте программу, вычисляющую A*B, не пользуясь операцией
//умножения.
public class Task2_4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите A - ");
        int a = scanner.nextInt();

        System.out.print("Введите B - ");
        int b = scanner.nextInt();

        int product = 0;
        int counter = 0;

        do {
            product += a;
            counter++;
        } while(counter < b);

        System.out.println("A * B = " + product);

    }
}
