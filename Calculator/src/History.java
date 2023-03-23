public class History {
    int historySize;
    double[] history;
    int numberOfResult;
    boolean[] isResult;

    public History(int historySize, double[] history, int numberOfResult, boolean[] isResult) {
        this.historySize = historySize;
        this.history = history;
        this.numberOfResult = numberOfResult;
        this.isResult = isResult;
    }
    void showHistory(double[] history){
        System.out.println("История результатов операций: ");
        for (int i = 0; i < historySize; i++) {
            if(isResult[i]) {
                System.out.print(history[i] + "; ");
            }
        }
        System.out.println();
    }
    void addResult (double result){
        if (numberOfResult < historySize) {
            history[numberOfResult] = result;
            isResult[numberOfResult] = true;
        } else {
            numberOfResult = 0;
            history[numberOfResult] = result;
        }
        numberOfResult++;
    }
}
