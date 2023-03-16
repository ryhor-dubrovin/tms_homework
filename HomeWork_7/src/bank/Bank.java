package bank;

public class Bank {
    private String name;

    public void sayHi(Person user) {
        System.out.println("Приветствуем вас " + user.getName() + " " + user.getLastName() + " !");
    }


}
