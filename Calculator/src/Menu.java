import MathOperations.Difference;
import MathOperations.Division;
import MathOperations.Multiply;
import MathOperations.Sum;
import java.util.Scanner;
public class Menu{
    Scanner scanner = new Scanner(System.in);
    int historySize = 5;
    double[] history = new double[historySize];
    boolean[] isResult = new boolean[historySize];
    History calcHistory = new History(historySize,history);
    //History calcHistory = new History(history);
    int numberOfResult = 0;


    public void runMenu() {

        System.out.println("========================== Калькулятор ==========================");
        for (int i = 0; i < historySize; i++) {
            history[i] = 0;
            isResult[i] = false;
        }
        while (true) {
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
                        if (numberOfResult < historySize) {
                            calcHistory.addResult(result, numberOfResult);
                            isResult[numberOfResult] = true;
                            numberOfResult++;
                        } else {
                            numberOfResult = 0;
                            calcHistory.addResult(result, numberOfResult);
                            numberOfResult++;
                        }
                    }
                    break;
                case 0:
                    System.out.println("Завершение работы.");
                    System.exit(0);
                    break;
                case 5:
                    calcHistory.showHistory(history,isResult);
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