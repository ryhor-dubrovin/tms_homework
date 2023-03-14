public class FreightTransport extends GroundTransport {
    private int loadCapacity;
    public FreightTransport(int power, int weight, int maxSpeed, String brand, int wheels, int fuelConsumption, int loadCapacity) {
        super(power, weight, maxSpeed, brand, wheels, fuelConsumption);
        this.loadCapacity = loadCapacity;
    }
}
