import java.util.Random;
import java.util.Scanner;
//Пользователь должен указать с клавиатуры положительное чётное число, а программа должна создать массив
//указанного размера из случайных целых чисел из [0;15] и вывести его на экран в строку. После этого программа
//должна определить и сообщить пользователю о том, сумма какой половины массива
//больше: левой или правой, либо сообщить, что эти суммы модулей равны.
// Если пользователь введёт неподходящее число, то выдать соответствующее сообщение
public class Task1_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите чётное положительное число: ");
        int num = scanner.nextInt();

        int[] array = new int[num];
        Random random = new Random();

        if(num % 2 != 0) {
            System.out.println("Error message");
        } else {

            for (int i = 0; i < num; i++) {
                array[i] = random.nextInt(16);
                System.out.print(array[i] + " ");
            }
            System.out.println();

            int sum1 = 0, sum2 = 0;

            for (int i = 0; i < num/2; i++) {
                sum1 += array[i];
            }
            for (int i = array.length-1; i > (num/2)-1; i--) {
                sum2 += array[i];
            }

            if (sum1 > sum2) {
                System.out.println("Сумма первой половины элементов больше, чем второй.");
            } else if (sum2 > sum1) {
                System.out.println("Сумма второй половины элементов больше, чем первой.");
            } else {
                System.out.println("Сумма первой половины элементов равна сумме второй половины.");
            }

        }

    }
}
