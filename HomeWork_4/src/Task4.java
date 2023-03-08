import java.util.Random;
//Посчитать сумму четных элементов стоящих над побочной диагональю (не включительно)
public class Task4 {
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

        int sumUnder = 0, sumAbove = 0;

        for (int i = 1; i < array.length; i++) {
            int jj = array.length-1;
            for (int j = 1; j < i+1; j++) {
                if (array[i][jj] % 2 == 0) {
                        sumUnder+= array[i][jj];
                }
                jj--;
            }
        }

        int jj = array.length - 2;
        for (int i = 0; i < array.length-1; i++) {
            for (int j = jj; j >= 0 ; j--) {
                if (array[i][j] % 2 == 0) {
                    sumAbove += array[i][j];
                }
            }
            jj--;
        }

        System.out.println("_________");
        System.out.println("Сумма четных элементов НАД побочной диагональю = " + sumAbove);
        System.out.println("Сумма четных элементов ПОД побочной диагональю = " + sumUnder);

    }
}
