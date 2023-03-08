import java.util.Scanner;
//В переменную присвойте какое-то число. Посчитайте сумму его цифр.
// Представим, что вводимое число неизвестно заранее.
public class Task2_12 {
    public static void main(String[] args) {

        System.out.print("Введите число - ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sum = 0;

        do {
            sum += num % 10;
           // num -= sum;
            num -= num % 10;
            num /= 10;
            if (num < 10) sum += num;
        } while (num > 9);

        System.out.println(sum);
    }
}
