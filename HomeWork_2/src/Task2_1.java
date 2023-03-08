//Начав тренировки, спортсмен в первый день пробежал 10 км. Каждый
//день он увеличивал дневную норму на 10% нормы предыдущего дня. Какой
//суммарный путь пробежит спортсмен за 7 дней?
public class Task2_1 {
    public static void main(String[] args) {

        double totalDistance = 0;
        double dailyDistance = 10.0;

        for (int i = 0; i < 7; i++) {
            totalDistance += dailyDistance;
            dailyDistance *= 1.1;
        }

        System.out.println(totalDistance);

    }
}
