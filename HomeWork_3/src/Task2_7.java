import java.util.Random;
import java.util.Scanner;
//Подсчитать, сколько раз встречается элемент с заданным значением.
public class Task2_7 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        System.out.print("Введите значение: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int counter = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
            System.out.print(array[i] + " ");
            if (array[i] == num) {
                counter++;
            }
        }
        System.out.println();
        System.out.println("Элемент с заданным значением встречается " + counter + " раз(a).");
    }
}
