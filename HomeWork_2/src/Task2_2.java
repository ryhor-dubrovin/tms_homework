//Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить,
//сколько амеб будет через 3, 6, 9, 12,..., 24 часа.
public class Task2_2 {
    public static void main(String[] args) {

        int cellCounter = 1;

        for (int i = 0; i < 25 ; i += 3) {

            System.out.println("Через " + i + " ч. - " + cellCounter);
            cellCounter *= 2;

        }


    }
}
