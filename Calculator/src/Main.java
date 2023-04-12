import History.History2Imp;
import History.HistoryImp;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        HistoryImp history = new HistoryImp();
        History2Imp history2 = new History2Imp();
        menu.runMenu(history2);
    }
}
