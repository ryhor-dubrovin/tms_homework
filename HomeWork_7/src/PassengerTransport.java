public class PassengerTransport extends GroundTransport{
    private String bodyType;
    private int passNumber;
    public PassengerTransport(int power, int weight, int maxSpeed, String brand, int wheels, int fuelConsumption, String bodyType, int passNumber) {
        super(power, weight, maxSpeed, brand, wheels, fuelConsumption);
        this.bodyType = bodyType;
        this.passNumber = passNumber;
    }
}
