import java.util.Random;
//Посчитать сумму четных элементов стоящих на главной диагонали.
public class Task1 {
    public static void main(String[] args) {
        int[][] array = new int[5][10];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = random.nextInt(10);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i][i] % 2 == 0){
                sum += array[i][i];
            }
        }
        System.out.println("Сумма четных элементов на главной диагонали = " + sum);
        System.out.println(array[0].length);
        System.out.println(array[1].length);
    }
}
