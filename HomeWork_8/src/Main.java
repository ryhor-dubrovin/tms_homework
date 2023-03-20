import firstPart.IStart;
import firstPart.Shuttle;
import firstPart.SpaceX;
import firstPart.Spaceport;

public class Main {
    public static void main(String[] args) {
        Spaceport spaceport = new Spaceport();
        Shuttle shuttle = new Shuttle();
        SpaceX teslaFly = new SpaceX();

        spaceport.launch(shuttle);
        spaceport.launch(teslaFly);
    }
}