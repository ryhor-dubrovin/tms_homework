import java.util.Random;
//Проверить произведение элементов какой диагонали больше.
public class Task3 {
    public static void main(String[] args) {
        int[][] array = new int[5][5];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = random.nextInt(10);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        int product1 = 1, product2 = 1;

        for (int i = 0; i < array.length; i++) {
            product1 *= array[i][i];
        }

        int i = 0, j = array.length-1;

        while (i < array.length) {
            product2 *= array[i][j];
            i++;
            j--;
        }
        System.out.println(product1);
        System.out.println(product2);

    }

}
