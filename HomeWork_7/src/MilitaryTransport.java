public class MilitaryTransport extends AirTransport{
    private boolean ejectionSystemAvailable;
    private int rocketCount;
    public MilitaryTransport(int power,
                             int weight,
                             int maxSpeed,
                             String brand,
                             String bodyType,
                             int passNumber,
                             int wingspan,
                             int minRunwayLength,
                             boolean ejectionSystemAvailable,
                             int rocketCount) {
        super(power, weight, maxSpeed, brand, bodyType, passNumber, wingspan, minRunwayLength);
        this.ejectionSystemAvailable = ejectionSystemAvailable;
        this.rocketCount = rocketCount;
    }
}
