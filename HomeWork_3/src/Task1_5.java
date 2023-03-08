import java.util.Random;
//Создайте 2 массива из 5 случайных целых чисел из отрезка [0;15] каждый,
// выведите массивы на экран в двух отдельных строках. Посчитайте среднее
// арифметическое элементов каждого массива и сообщите, для какого из массивов
// это значение оказалось больше (либо сообщите, что их средние арифметические равны)
public class Task1_5 {
    public static void main(String[] args) {
        int[] array1 = new int[5];
        int[] array2 = new int[5];
        int arrSum1 = 0;
        int arrSum2 = 0;

        Random random = new Random();

        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt(15);
            array2[i] = random.nextInt(15);
            arrSum1 += array1[i];
            arrSum2 += array2[i];
        }

        for (int a : array1) {
            System.out.print(a + " ");
        }

        System.out.println();

        for (int a : array2) {
            System.out.print(a + " ");
        }

        System.out.println();

        double av1 = (double) arrSum1 / (double) array1.length;
        double av2 = (double) arrSum2 / (double) array2.length;

        if (av1 > av2) {
            System.out.println("Ср арифм 1 > арифм 2");
        } else if (av1 < av2) {
            System.out.println("Ср арифм 2 > арифм 1");
        } else {
            System.out.println("Ср арифм равны");
        }
    }
}
