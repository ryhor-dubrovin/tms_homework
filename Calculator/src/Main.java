import History.HistoryImp;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        HistoryImp history = new HistoryImp();
        menu.runMenu(history);
    }
}
