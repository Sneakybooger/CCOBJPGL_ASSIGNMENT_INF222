import Explorers.*;
import Planets.*;

public class App {

public static void main(String[] args) {


Planet mars = new Mars();
Planet saturn = new Saturn();
Planet mercury = new Mercury();
Planet venus = new Venus();
Planet earth = new Earth();
Planet jupiter = new Jupiter();
Planet uranus = new Uranus();
Planet pluto = new Pluto();
Planet neptune = new Neptune();


Explorer astronaut = new HumanExplorer();
Explorer rover = new RobotExplorer();
Explorer andriod = new AndriodExplorer();

System.out.println("Human Explorer: ");
mars.accept(astronaut);
saturn.accept(astronaut);
mercury.accept(astronaut);
venus.accept(astronaut);
earth.accept(astronaut);
jupiter.accept(astronaut);
uranus.accept(astronaut);
pluto.accept(astronaut);
neptune.accept(astronaut);


System.out.println("");

System.out.println("Robot Explorer: ");
mars.accept(rover);
saturn.accept(rover);
mercury.accept(rover);
venus.accept(rover);
earth.accept(rover);
jupiter.accept(rover);
uranus.accept(rover);
pluto.accept(rover);
neptune.accept(rover);

System.out.println("");

System.out.println("Andriod Explorer: ");
mars.accept(andriod);
saturn.accept(andriod);
mercury.accept(andriod);
venus.accept(andriod);
earth.accept(andriod);
jupiter.accept(andriod);
uranus.accept(andriod);
pluto.accept(andriod);
neptune.accept(andriod);


}
}
