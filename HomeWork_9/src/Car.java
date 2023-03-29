import java.util.Random;

public class Car {
    private String brand;
    private String model;
    int yearOfDevelop;
    int maxSpeed;
    int numberOfSeats;
    Random random = new Random();

    public Car(String brand, String model, int yearOfDevelop, int maxSpeed, int numberOfSeats) {
        this.brand = brand;
        this.model = model;
        this.yearOfDevelop = yearOfDevelop;
        this.maxSpeed = maxSpeed;
        this.numberOfSeats = numberOfSeats;
    }
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfDevelop() {
        return yearOfDevelop;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void start() {
        int a = random.nextInt(21);

        if(a % 2 != 0) {
            System.out.println("Завелся!");
        }
    }

}
