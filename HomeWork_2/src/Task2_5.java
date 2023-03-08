//Напишите программу печати таблицы перевода расстояний из дюймов в
//сантиметры для значений длин от 1 до 20 дюймов. 1 дюйм = 2,54 см
public class Task2_5 {
    public static void main(String[] args) {

        double sm = 2.54;

        for (int inch = 1 ; inch < 21; inch++) {

            System.out.println(inch + " in = " + sm + " sm");
            sm += 2.54;

        }
    }
}
