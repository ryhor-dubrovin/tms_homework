package bank;

public class Main {
    public static void main(String[] args) {
        Bank BOG = new Bank();
        Person user1 = new Person("Тестовый","Пользователь","Belarus","10.03.1990",
                            123456789,10000.25,0,500);

        BOG.sayHi(user1);
        System.out.println(user1.getPersonalNumber());
        user1.changeUserPersonalNumber(987654321);
        System.out.println(user1.getPersonalNumber());
    }
}
