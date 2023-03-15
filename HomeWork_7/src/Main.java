public class Main {
    public static void main(String[] args) {
        PassengerTransport audi = new PassengerTransport(3000,1500,190,"Audi a4", 4,15,"седан", 5);
        CivilAirTransport boeing = new CivilAirTransport(7500000, 100000,5000,"Boeing 737", 300, 500, 150, true);
        FreightTransport maz = new FreightTransport(7500,5000, 70,"MAZ Mensk",6,20,30);
        MilitaryTransport f16 = new MilitaryTransport(30000,2500,7500,"F16 for Ukr", 50, 100,true,6);

        audi.getInfo();
        audi.kmAndFuelConsPerTime(5.5);

        maz.canCargoBePlaced(32);

        boeing.canPassBePlaced(150);

        f16.fire();
        f16.letsFly();
    }
}