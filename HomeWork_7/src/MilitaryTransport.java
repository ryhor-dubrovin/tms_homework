public class MilitaryTransport extends AirTransport{
    private boolean ejectionSystemAvailable;
    private int rocketCount;

    public MilitaryTransport(int power,
                             int weight,
                             int maxSpeed,
                             String brand,
                             int wingspan,
                             int minRunwayLength,
                             boolean ejectionSystemAvailable,
                             int rocketCount) {
        super(power, weight, maxSpeed, brand, wingspan, minRunwayLength);
        this.ejectionSystemAvailable = ejectionSystemAvailable;
        this.rocketCount = rocketCount;
    }
    public void fire() {
        System.out.println(rocketCount == 0 ? "Боеприпасы отсутствуют." : "Ракета пошла...");
    }
    public void letsFly () {
        System.out.println(ejectionSystemAvailable ? "Катапультирование прошло успешно" : "У вас нет такой системы");
    }
}
