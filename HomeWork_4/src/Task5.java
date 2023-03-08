import java.util.Random;
//Транспонировать матрицу(1 столбец станет 1-й строкой, 2-й столбец - 2-й строкой и т. д.)
public class Task5 {
    public static void main(String[] args) {
        int[][] array1 = new int[3][3];
        int[][] array2 = new int[3][3];
        Random random = new Random();

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1.length; j++) {
                array1[i][j] = random.nextInt(10);
                System.out.print(array1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("_____");
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1.length; j++) {
                array2[i][j] = array1[j][i];
                System.out.print(array2[i][j] + " ");
            }
            System.out.println();
        }


    }
}
