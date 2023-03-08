import java.util.Random;
//«Сожмите» массив, выбросив из него каждый второй элемент.
//«Освободившиеся» места массива заполните нулями.
public class Task2_5 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 1; i < array.length; i +=2) {
            array[i] = 0;
        }
        for (int a: array) {
            System.out.print(a + " ");
        }

    }
}
