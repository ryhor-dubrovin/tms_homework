import java.util.Scanner;
// Даны 2 числа. Вывести большее из них.
public class Task1_6 {
    public static void main(String[] args) {

        System.out.println("Введите 2 числа - ");

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println(a);
        } else if (b > a) {
            System.out.println(b);
        } else {
            System.out.println("числа равны");
        }
    }
}
