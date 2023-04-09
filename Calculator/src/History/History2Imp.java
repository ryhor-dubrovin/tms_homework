package History;

import java.util.ArrayList;

public class History2Imp implements History {

    ArrayList<Double> history = new ArrayList<>();
    @Override
    public void showHistory() {
        System.out.println("История результатов операций: ");
        if (history.size() < 6) {
            System.out.println(history);
        } else {
            for (int i = history.size() - 5; i < history.size(); i++) {
                System.out.print(history.get(i) + "; ");
            }
            System.out.println();
        }
    }

    @Override
    public void addResult(double result) {
        history.add(result);
    }
}
