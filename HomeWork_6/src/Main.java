public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator(5.0,10.0);
        Computer macBook = new Computer("MacBook Pro","M1",16,256,5);

        macBook.getInfo();
        macBook.turnOn();
        macBook.turnOff();
        System.out.println(macBook.resource);

        System.out.println("-------------------------");

        System.out.println("сумма = " + calc.calcSum());
        System.out.println("разность = " + calc.calcDifference());
        System.out.println("произведение = " + calc.calcProduction());
        System.out.println("частное = " + calc.calcQuotient());
    }
}