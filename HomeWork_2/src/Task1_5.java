import java.util.Scanner;
// Даны 3 целых числа. Найти количество положительных и отрицательных чисел в исходном наборе.
public class Task1_5 {
    public static void main(String[] args) {

        int positiveCounter = 0;
        int negativeCounter = 0;

        System.out.println("введите 3 числа - ");

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a > 0) {
            positiveCounter++;
        } else if (a < 0) {
            negativeCounter++;
        }

        if (b > 0) {
            positiveCounter++;
        } else if (b < 0) {
            negativeCounter++;
        }

        if (c > 0) {
            positiveCounter++;
        } else if (c < 0) {
            negativeCounter++;
        }

        System.out.println("Вы ввели " + positiveCounter + " положительных чисел и " + negativeCounter + " отрицательных.");
    }
}
