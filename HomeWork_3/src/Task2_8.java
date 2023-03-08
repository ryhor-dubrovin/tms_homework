import java.util.Random;

//Найти второй по величине (т.е. следующий по величине за максимальным) элемент в массиве.
public class Task2_8 {
    public static void main(String[] args) {
        int[] array = new int[5];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(11);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int maxVal = 0;

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if ((array[i] > array[j]) && (array[i] > maxVal)) {
                    maxVal = array[i];
                }
            }
        }
        if (array[array.length-1] > maxVal) {
            maxVal = array[array.length-1];
        }

//        System.out.println("maxVal - " + maxVal);

        for (int i = 0; i < array.length; i++) {
            if (array[i] == maxVal) {
                array[i] = 0;
            }
        }
//        for(int a: array){
//            System.out.print(a + " ");
//        }
//        System.out.println();

        int secMaxVal = 0;

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j] && array[i] > secMaxVal) {
                    secMaxVal = array[i];
                }
            }
        }
        if (array[array.length-1] > secMaxVal) {
            secMaxVal = array[array.length-1];
        }
        System.out.println("secMaxVal - " + secMaxVal);

    }
}
