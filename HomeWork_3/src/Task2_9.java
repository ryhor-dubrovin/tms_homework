import java.util.Random;
// Найти наименьший элемент среди элементов с четными индексами массива
public class Task2_9 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + " ");
        }
        int minWithEvenIndex = array[0];
        for (int i = 2; i < array.length; i += 2) {
            if (array[i] < minWithEvenIndex) {
                minWithEvenIndex = array[i];
            }
        }
        System.out.println();
        System.out.println("Наименьший элемент с четным индексом - " + minWithEvenIndex);
    }
}
