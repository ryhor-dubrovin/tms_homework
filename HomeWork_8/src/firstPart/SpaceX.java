package firstPart;

import java.util.Random;

public class SpaceX implements IStart{
    @Override
    public boolean preStartCheck() {
        Random random = new Random();
        boolean result = random.nextBoolean();

        return result;
    }

    @Override
    public void engineStarting() {
        System.out.println("пыр пыр пыр пук");

    }

    @Override
    public void start() {
        System.out.println("мы в космосе!");

    }
}
