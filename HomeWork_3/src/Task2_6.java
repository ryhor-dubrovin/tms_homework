import java.sql.SQLOutput;
import java.util.Random;
//Проверить, различны ли все элементы массива.
public class Task2_6 {
    public static void main(String[] args) {
        int[] array = new int[5];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(11);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int counter = 0;
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    counter++;
                }
            }
        }

        if (counter > 0) {
            System.out.println("Не все элементы различны.");
        } else {
            System.out.println("Все элементы различны.");
        }

    }
}
