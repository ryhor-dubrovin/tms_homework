import java.util.Scanner;
public class Menu{
    Scanner scanner = new Scanner(System.in);

    public void runMenu() {
        while (true) {
            System.out.println("Введите 1 для начало работы или 0 для выхода.");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Введите первое число -");
                    double a = scanner.nextDouble();
                    System.out.println("Введите второе число -");
                    double b = scanner.nextDouble();
                    System.out.println("Введите действие(+,-,*,/) -");
                    scanner.nextLine();
                    String action = scanner.nextLine();
                    double result = 0;
                    boolean actionValidation = true;
                    switch (action){
                        case "+":
                            Sum sum = new Sum();
                            result = sum.action(a,b);
                            break;
                        case "-":
                            Difference diff = new Difference();
                            result = diff.action(a,b);
                            break;
                        case "*":
                            Multiply multiply = new Multiply();
                            result = multiply.action(a,b);
                            break;
                        case "/":
                            Division div = new Division();
                            result = div.action(a,b);
                            break;
                        default:
                            System.out.println("Введено неверное действие.");
                            actionValidation = false;
                    }
                    if(actionValidation) System.out.println("Result = " + result);
                    break;
                case 0:
                    System.out.println("Завершение работы.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Введена неверная опция.");
            }
        }
    }
}
