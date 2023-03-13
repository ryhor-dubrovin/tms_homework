public class Calculator {
    public double firstNumber;
    public double secondNumber;
    public Calculator (double firstNumber, double secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }
    public double calcSum () {
        return firstNumber + secondNumber;
    }
    public double calcProduction () {
        return firstNumber * secondNumber;
    }
    public double calcDifference () {
        return firstNumber - secondNumber;
    }
    public double calcQuotient () {
        return firstNumber / secondNumber;
    }
}