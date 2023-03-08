import java.util.Random;
//Создайте массив из 12 случайных целых чисел из отрезка [0;15].
// Определите какой элемент является в этом массиве максимальным
// и сообщите индекс его последнего вхождения в массив.
public class Task1_7 {
    public static void main(String[] args) {

        int[] array = new int[12];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(16);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int maxVal = array[0];
        int maxIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] >= maxVal) {
                maxVal = array[i];
                maxIndex = i;
            }
        }
        System.out.println("Максимальный элемент - " + maxVal + ", его последний индекс - " + maxIndex);
    }
}