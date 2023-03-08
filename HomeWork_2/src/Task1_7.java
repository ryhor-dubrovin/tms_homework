import java.util.Scanner;
// (Дополнительно) В переменную записываете количество программистов. В зависимости от количества программистов
// необходимо вывести правильно окончание. Например:
//• 2 программиста
//• 1 программист
//• 10 программистов
//• и т.д.
public class Task1_7 {
    public static void main(String[] args) {

        System.out.print("Введите количество программистов: ");

            Scanner scanner = new Scanner(System.in);
            int programmers = scanner.nextInt();
            int remainder = programmers % 10;

            if (remainder == 1) {
                if (programmers % 11 == 0) {
                    System.out.println(programmers + " программистов");
                } else {
                    System.out.println(programmers + " программист");
                }
            } else if (remainder > 1 && remainder < 5) {
                System.out.println(programmers + " программиста");
            } else {
                System.out.println(programmers + " программистов");
            }

    }
}
