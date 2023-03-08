import java.util.Scanner;
//Треугольник существует только тогда, когда сумма любых двух его сторон больше третьей.
// Определить существует ли такой треугольник. Дано: a, b, c – стороны предполагаемого треугольника.
// Требуется сравнить длину каждого отрезка-стороны с суммой двух других.
// Если хотя бы в одном случае отрезок окажется больше суммы двух других,
// то треугольника с такими сторонами не существует.
public class Task1_2 {
    public static void main(String[] args) {

        System.out.println("Введите стороны треугольника.");

        Scanner scanner = new Scanner(System.in);

        System.out.print("сторона a: ");
        int a = scanner.nextInt();

        System.out.print("сторона b: ");
        int b = scanner.nextInt();

        System.out.print("сторона c: ");
        int c = scanner.nextInt();

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Треугольник существует =)");
        } else {
            System.out.println("Такого треугольника не существует =(");
        }

    }
}
