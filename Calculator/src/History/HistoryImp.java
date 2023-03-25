package History;
public class HistoryImp implements History {
    private int historySize = 5;
    private double[] history = new double[historySize];
    private int numberOfResult = 0;
    private boolean[] isResult = new boolean[historySize];

    public void showHistory(){
        System.out.println("История результатов операций: ");
        for (int i = 0; i < historySize; i++) {
            if(isResult[i]) {
                System.out.print(history[i] + "; ");
            }
        }
        System.out.println();
    }
    public void addResult(double result){
        history[numberOfResult] = result;
        isResult[numberOfResult] = true;
        numberOfResult++;
        if (numberOfResult == historySize) numberOfResult = 0;
    }
}