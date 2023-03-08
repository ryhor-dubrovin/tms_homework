import java.util.Random;
//Создайте два массива из 10 целых случайных чисел из отрезка [0;9] и третий массив из 10 действительных чисел.
//Каждый элемент с i-ым индексом третьего массива должен равняться отношению элемента из первого массива с i-ым
//индексом к элементу из второго массива с i-ым индексом. Вывести все три  массива на экран (каждый на отдельной строке),
//затем вывести количество целых элементов в третьем массиве.
public class Task1_8 {
    public static void main(String[] args) {
        int[] array1 = new int[10];
        int[] array2 = new int[10];
        double[] array3 = new double[10];
        int counter = 0;

        Random random = new Random();

        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt(10);
            array2[i] = random.nextInt(10);
            array3[i] = (double) array1[i] / (double) array2[i];
            if (array3[i] % 1 == 0) counter++;
        }

        for (int a: array1) {
            System.out.print(a + " ");
        }
        System.out.println();

        for (int a: array2) {
            System.out.print(a + " ");
        }
        System.out.println();

        for (double a: array3) {
            System.out.print(a + " ");
        }
        System.out.println();
        System.out.println("Целых элементов в третьем массиве: " + counter);

    }
}
