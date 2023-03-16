public class GroundTransport extends Transport{
    private int wheels;
    private int fuelConsumption;

    public GroundTransport(int power, int weight, int maxSpeed, String brand, int wheels, int fuelConsumption) {
        super(power, weight, maxSpeed, brand);
        this.wheels = wheels;
        this.fuelConsumption = fuelConsumption;
    }
    public int getWheels() {
        return wheels;
    }
    public int getFuelConsumption() {
        return fuelConsumption;
    }
}
