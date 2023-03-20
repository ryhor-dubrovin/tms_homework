import firstPart.IStart;
import firstPart.Shuttle;
import firstPart.Spaceport;

public class Main {
    public static void main(String[] args) {
        Spaceport spaceport = new Spaceport();
        Shuttle shuttle = new Shuttle();
        spaceport.launch(shuttle);
    }
}