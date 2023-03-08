import java.util.Random;
//Создайте массив из 4 случайных целых чисел из отрезка [0;10], выведите его на экран в строку.
// Определить и вывести на экран сообщение о том, является ли массив строго возрастающей последовательностью.
public class Task1_6 {
    public static void main(String[] args) {

        int[] array = new int[4];
        Random random = new Random();
        int counter = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(11);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        for (int i = 1; i < array.length; i++) {
            if (array[i]>array[i-1]) counter++;
        }

        if (counter == array.length-1) {
            System.out.println("Массив - строго возрастающая последовательность");
        }

    }
}
