//Реализация числа Фибоначчи
public class Task2_9 {
    public static void main(String[] args) {

        int a = 0, b = 1, c = 0;

        System.out.print(a + " " + b);

        while (c < 1000000000) {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }

    }
}
