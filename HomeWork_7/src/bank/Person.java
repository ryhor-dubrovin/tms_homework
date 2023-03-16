package bank;

public class Person {
    private String name;
    private String lastName;
    private String birthCountry;
    private String dateOfBirth;
    private int personalNumber;
    private double USDAccount;
    private double EURAccount;
    private double BYNAccount;

    public Person(String name, String lastName, String birthCountry, String dateOfBirth, int personalNumber, double USDAccount, double EURAccount, double BYNAccount) {
        this.name = name;
        this.lastName = lastName;
        this.birthCountry = birthCountry;
        this.dateOfBirth = dateOfBirth;
        this.personalNumber = personalNumber;
        this.USDAccount = USDAccount;
        this.EURAccount = EURAccount;
        this.BYNAccount = BYNAccount;
    }

    public void setPersonalNumber(int personalNumber) {
        this.personalNumber = personalNumber;
    }

    public int getPersonalNumber() {
        return personalNumber;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public void changeUserPersonalNumber (int newNumber){
        personalNumber = newNumber;
    }

}
