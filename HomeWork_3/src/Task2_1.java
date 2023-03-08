import java.util.Random;
//Найти произведение элементов, кратных 3.
public class Task2_1 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        int counter = 1;

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1,10);
            System.out.print(array[i] + " ");
            if (array[i] % 3 == 0) counter *= array[i];
        }
        System.out.println();
        System.out.println(counter);
    }
}
