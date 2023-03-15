public class CivilAirTransport extends AirTransport{
    private int maxPassNumber;
    private boolean businessClassAvailable;
    public CivilAirTransport(int power,
                             int weight,
                             int maxSpeed,
                             String brand,
                             int wingspan,
                             int minRunwayLength,
                             int maxPassNumber,
                             boolean businessClassAvailable) {
        super(power, weight, maxSpeed, brand, wingspan, minRunwayLength);
        this.maxPassNumber = maxPassNumber;
        this.businessClassAvailable = businessClassAvailable;
    }
    public void canPassBePlaced (int passNumber) {
        System.out.println(maxPassNumber >= passNumber ? "Пассажиры влезли." : "Нужен самолет побольше.");
    }
}
