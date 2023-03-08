//Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в строку,
// а затем этот же массив выведите на экран тоже в строку, но в обратном порядке
// (99 97 95 93 … 7 5 3 1).
public class Task1_2 {
    public static void main(String[] args) {

        int[] array = new int[50];
        int value = 1;

        for (int i = 0; i < array.length; i++) {
            array[i] = value;
            value += 2;
        }

        for (int a: array) {
            System.out.print(a + " ");
        }

        System.out.println();

        for (int i = array.length-1; i > -1; i-- ) {
            System.out.print(array[i] + " ");
        }



    }
}