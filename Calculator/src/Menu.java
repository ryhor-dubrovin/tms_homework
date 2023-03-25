import History.History;
import MathOperations.Difference;
import MathOperations.Division;
import MathOperations.Multiply;
import MathOperations.Sum;
import java.util.Scanner;
import History.HistoryImp;
public class Menu{
    private Scanner scanner = new Scanner(System.in);

    public void runMenu(History history) {
        System.out.println("========================== Калькулятор ==========================");

        while(true) {
            int option = choseOption();

            switch (option) {
                case 1:
                    double a = inputUserMathOperationValue("Введите первое число -");
                    double b = inputUserMathOperationValue("Введите второе число -");
                    scanner.nextLine();
                    String action = choseAction();

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
                            incorrectActionMessage();
                            actionValidation = false;
                    }
                    if(actionValidation) {
                        System.out.println("Result = " + result);
                        separatingLine();
                        history.addResult(result);
                    }
                    break;
                case 0:
                    System.out.println("Завершение работы.");
                    System.exit(0);
                    break;
                case 5:
                    history.showHistory();
                    separatingLine();
                    break;
                default:
                    incorrectOptionMessage();
            }
        }
    }

    private int choseOption(){
        System.out.println("Введите: 1 - выполнить операцию, 0 - выход, 5 - показать историю.");
        int option = scanner.nextInt();
        return option;
    }
    private double inputUserMathOperationValue(String requestToUser) {
        System.out.println(requestToUser);
        double value = scanner.nextDouble();
        return value;
    }
    private String choseAction() {
        System.out.println("Введите действие(+,-,*,/) -");
        String action = scanner.nextLine();
        return action;
    }
    private void incorrectActionMessage() {
        System.out.println("Введено неверное действие.");
        separatingLine();
    }
    private void incorrectOptionMessage() {
        System.out.println("Введена неверная опция.");
        separatingLine();
    }
    private void separatingLine() {
        System.out.println("-----------------------------------------------------------------");
    }
}