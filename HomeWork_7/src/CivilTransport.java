public class CivilTransport extends AirTransport{
    private int passNumber;
    private boolean businessClassAvailable;
    public CivilTransport(int power,
                          int weight,
                          int maxSpeed,
                          String brand,
                          String bodyType,
                          int passNumber,
                          int wingspan,
                          int minRunwayLength,
                          int passNumber1,
                          boolean businessClassAvailable) {
        super(power, weight, maxSpeed, brand, bodyType, passNumber, wingspan, minRunwayLength);
        this.passNumber = passNumber1;
        this.businessClassAvailable = businessClassAvailable;
    }
}
