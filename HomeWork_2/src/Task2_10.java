import java.util.Scanner;

//Выведите на экран все положительные делители натурального числа
public class Task2_10 {
    public static void main(String[] args) {

        System.out.print("Введите число - ");

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        for (int i = 1; i < num+1; i++) {
            if (num % i == 0) System.out.println(i);
        }


    }
}
