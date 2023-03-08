import java.util.Random;
//Найти среднее арифметическое элементов с нечетными номерами.
public class Task2_2 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        int oddSum = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1,10);
            System.out.print(array[i] + " ");
            if (i % 2 != 0) oddSum += array[i];
        }
        System.out.println();
        double oddAverage = (double) oddSum/ (double) (array.length / 2);
        System.out.println(oddAverage);
    }
}
