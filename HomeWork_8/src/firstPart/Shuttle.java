package firstPart;

import java.util.Random;

public class Shuttle implements IStart{
    @Override
    public boolean preStartCheck() {
        Random random = new Random();
        int randomNum = random.nextInt(11);

        return randomNum > 3;
    }

    @Override
    public void engineStarting() {
        System.out.println("Двигатели Шатла запущены. Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Старт Шатла");
    }
}
