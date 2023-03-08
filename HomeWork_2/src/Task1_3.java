import java.util.Scanner;
// Дано целое число. Если оно является положительным, то прибавить к нему 1.
// Если отрицательным, то вычесть из него 2. Если нулевым, то заменить его на 10.
// Вывести полученное число.
public class Task1_3 {
    public static void main(String[] args) {

        System.out.print("Введите число - ");

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if (a > 0) {
            ++a;
        } else if (a < 0) {
            a -= 2;
        } else {
            a = 10;
        }

        System.out.println("Результат - " + a);
    }
}
