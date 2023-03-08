import java.util.Random;
import java.util.Scanner;
//Пользователь вводит с клавиатуры число большее 3, которое сохраняется в переменную n.
//Если пользователь ввёл не подходящее число, то программа должна выдать соответствующее сообщение.
//Создать массив из n случайных целых чисел из отрезка [0;n] и вывести его на экран. Создать второй массив
//только из чётных элементов первого массива, если они там есть, и вывести его на экран.
public class Task1_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число > 3: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        Random random = new Random();

        if (n < 4) {
            System.out.println("Error message");
        } else {
            int secondArrayLength = 0;
            for (int i = 0; i < array.length; i++) {
                array[i] = random.nextInt(n+1);
                System.out.print(array[i] + " ");
                if (array[i] % 2 == 0) {
                    secondArrayLength++;
                }
            }
            System.out.println();
            if (secondArrayLength > 0) {
                int[] array2 = new int[secondArrayLength];
                int j = 0;

                for (int i = 0; i < array.length; i++) {
                    if (array[i] % 2 == 0) {
                        array2[j] = array[i];
                        System.out.print(array2[j] + " ");
                        j++;
                    }
                }
            }
        }
    }
}
