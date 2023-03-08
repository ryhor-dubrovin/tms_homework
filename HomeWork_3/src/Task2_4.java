import java.util.Random;
//Найти наименьший нечетный элемент.
public class Task2_4 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        int min = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + " ");
            if (array[i] % 2 != 0) {
                min = array[i];
            }
        }

        System.out.println();

        if (min == 0) {
            System.out.println("В массиве отсутствуют нечетные элементы");
        } else {
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 != 0 && array[i] < min) {
                    min = array[i];
                }
            }
            System.out.println("Наименьший нечетный элемент - " + min);
        }
    }
}
