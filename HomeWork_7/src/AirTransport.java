public class AirTransport extends Transport{
    private int wingspan;
    private int minRunwayLength;

    public AirTransport(int power, int weight, int maxSpeed, String brand, int wingspan, int minRunwayLength){
        super(power, weight, maxSpeed, brand);
        this.wingspan = wingspan;
        this.minRunwayLength = minRunwayLength;
    }
}
