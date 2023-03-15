import java.util.Scanner;

public class PassengerTransport extends GroundTransport{
    private String bodyType;
    private int passNumber;
    public PassengerTransport(int power, int weight, int maxSpeed, String brand, int wheels, int fuelConsumption, String bodyType, int passNumber) {
        super(power, weight, maxSpeed, brand, wheels, fuelConsumption);
        this.bodyType = bodyType;
        this.passNumber = passNumber;
    }
    public void getInfo(){
        System.out.println("============================");
        System.out.println("Легковой автомобиль " + getBrand());
        System.out.println("Мощность - " + getPower() + " л.с. (" + getPowerKv() + " кв.)");
        System.out.println("Масса - " + getWeight() + " кг.");
        System.out.println("Максимальная скорость - " + getMaxSpeed() + " км/ч");
        System.out.println("Количество колес - " + getWheels());
        System.out.println("Расход топлива - " + getFuelConsumption() + " л/100км");
        System.out.println("Тип кузова - " + bodyType);
        System.out.println("Количество пассажиров - " + passNumber);
        System.out.println("============================");
    }
    public void kmAndFuelConsPerTime(double time) {
        double distance = getMaxSpeed() * time;
        System.out.println("Двигаясь с макс. скоростью " + getMaxSpeed() +
                " км/ч, за " + time + " ч автомобиль " + getBrand() + " проедет " +
                distance + " км и израсходует " +
                getFuelConsumptionPerDistance(distance) + " литров топлива.");
    }
    private double getFuelConsumptionPerDistance(double distance) {
        return getFuelConsumption() / 100.0 * distance;
    }
}
