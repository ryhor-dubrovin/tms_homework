public class Calculator {
    public double firstNumber;
    public double secondNumber;
    public Calculator (double firstNumber, double secondNumber) {

    }
    public double calcSum (Calculator param) {
        return param.firstNumber + param.secondNumber;
    }
    public double calcProduction (Calculator param) {
        return param.firstNumber * param.secondNumber;
    }
    public double calcDifference (Calculator param) {
        return param.firstNumber - param.secondNumber;
    }
    public double calcQuotient (Calculator param) {
        return param.firstNumber / param.secondNumber;
    }

}
