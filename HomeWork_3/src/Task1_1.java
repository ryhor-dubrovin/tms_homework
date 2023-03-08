//Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы массива на экран
// сначала в строку, отделяя один элемент от другого пробелом, а затем в столбик
// (отделяя один элемент от другого началом новой строки). Перед  созданием массива подумайте,
// какого он будет размера.
public class Task1_1 {
    public static void main(String[] args) {

        int[] array = new int[10];
        int value = 2;

        for (int i = 0; i < 10; i++) {
            array[i] = value;
            value += 2;
        }

        for (int a: array) {
            System.out.print(a + " ");
        }

        System.out.println();

        for (int a: array) {
            System.out.println(a);
        }
    }
}
