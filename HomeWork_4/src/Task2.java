import java.util.Random;
//Вывести нечетные элементы находящиеся под главной
//диагональю(включительно).
public class Task2 {
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
//        int sum = 0;
        int a = 1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < a; j++) {
//                sum += array[i][j];
                if(array[i][j] % 2 != 0) {
                    System.out.print(array[i][j] + " ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
            a++;
        }
//        System.out.println(sum);
    }
}
