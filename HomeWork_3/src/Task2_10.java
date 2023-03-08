import java.util.Random;
//Найти максимальный элемент в массиве и поменять его местами с нулевым элементом
public class Task2_10 {
    public static void main(String[] args) {
        int[] array = new int[5];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(11);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int maxVal = 0;
        int maxValIndex = 0;

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if ((array[i] > array[j]) && (array[i] > maxVal)) {
                    maxVal = array[i];
                    maxValIndex = i;
                }
            }
        }
        if (array[array.length-1] > maxVal) {
            maxVal = array[array.length-1];
            maxValIndex = array.length - 1;
        }

        array[maxValIndex] = array[0];
        array[0] = maxVal;

        for(int a: array) {
            System.out.print(a + " ");
        }

    }
}
