import java.util.Random;
// В переменную записываем число. Надо вывести на экран сколько в этом числе цифр и положительное оно
// или отрицательное. Например, "это однозначное положительное число". Достаточно будет определить,
// является ли число однозначным, "двухзначным или трехзначным и более.

public class Task1_1 {
    public static void main(String[] args) {

        Random random = new Random();
        int a = random.nextInt(-1000,1000);

        System.out.println("число " + a + " - ");

        if ( a > 0 && a < 10) {
            System.out.println("однозначное положительное");
        } else if (a > 9 && a < 100) {
            System.out.println("двухзначное положительное");
        } else if (a > 99 && a < 1000) {
            System.out.println("трехзначеное положительное");
        } else if (a < 0 && a > -10) {
            System.out.println("однозначное отрицательное");
        } else if (a < -9 && a > -100) {
            System.out.println("двузначное отрицательное");
        } else if (a < -99 && a > -1000) {
            System.out.println("трехзначное отрицательное");
        } else if (a == 0) {
            System.out.println("не положительный и не отрицательный ноль");
        } else {
            System.out.println("такой кейс не обрабатываем");
        }

    }
}
