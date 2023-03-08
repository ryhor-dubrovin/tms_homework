import java.util.Scanner;
// Даны 3 целых числа. Найти количество положительных чисел в исходном наборе.
public class Task1_4 {
    public static void main(String[] args) {

        int counter = 0;

        System.out.println("введите 3 числа - ");

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a > 0) counter++;
        if (b > 0) counter++;
        if (c > 0) counter++;

        System.out.println("Вы ввели " + counter + " положительных чисел.");
    }
}
