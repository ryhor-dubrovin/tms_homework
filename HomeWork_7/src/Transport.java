public class Transport {
    private int power;
    private int weight;
    private int maxSpeed;
    private String brand;

    public Transport(int power, int weight, int maxSpeed, String brand) {
        this.power = power;
        this.weight = weight;
        this.maxSpeed = maxSpeed;
        this.brand = brand;
    }
    public double getPowerKv(){
        return power * 0.74;
    }

    public int getPower() {
        return power;
    }

    public int getWeight() {
        return weight;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getBrand() {
        return brand;
    }
}
