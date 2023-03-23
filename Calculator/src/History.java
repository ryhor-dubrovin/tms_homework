public class History {
    int historySize;
    double[] history = new double[historySize];

    public History(double[] history) {
        this.history = history;
    }
    public History(int historySize, double[] history) {
        this.historySize = historySize;
        this.history = history;
    }

    void addResult(double operationResult, int i) {
        history[i] = operationResult;
    }
    void showHistory(double[] history, boolean[] show){
        System.out.println("История результатов операций: ");
        for (int i = 0; i < historySize; i++) {
            if(show[i]) {
                System.out.print(history[i] + "; ");
            }
        }
        System.out.println();
    }
}
