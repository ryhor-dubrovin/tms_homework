import java.util.Random;
//Создайте массив из 15 случайных целых чисел из отрезка [0; 99]. Выведите массив на экран.
// Подсчитайте сколько в массиве чётных элементов и выведете это количество на экран на
// отдельной строке.
public class Task1_3 {
    public static void main(String[] args) {

        Random random = new Random();
        int[] array = new int[15];
        int counter = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + " ");
            if (array[i] % 2 == 0) counter++;
        }
        System.out.println();
        System.out.print("В массиве " + counter + " четных");
    }
}
