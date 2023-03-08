import java.util.Random;
//реализовать сортировку пузырьком (по возрастанию или убыванию одну на выбор)
public class Task1_11 {
    public static void main(String[] args) {
        int[] array = new int[15];
        Random random = new Random();

        System.out.println("Array:");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(16);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int tmp = 0;

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] < array[j]) {                  // < - desc, > - asc
                    tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
        System.out.println("Sort array (desc):");
        for (int a: array) {
            System.out.print(a + " ");
        }

    }
}
