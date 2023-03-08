import java.util.Random;
import java.util.Scanner;
//Найти средне арифметическое элементов массива, превосходящих некоторое число С.
public class Task2_3 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        System.out.print("Введите С: ");
        Scanner scanner = new Scanner(System.in);
        int c = scanner.nextInt();
        int sum = 0, counter = 0;

        for(int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + " ");
            if (array[i] > c) {
                sum+= array[i];
                counter++;
            }
        }
        System.out.println();
        double average = (double) sum / (double) counter;
        if (counter > 0) {
            System.out.println("Среднее арифметическое элементов массива больших " + c + " = " + average);
        } else {
            System.out.println("В массиве нету элементов больших " + c);
        }

    }
}
