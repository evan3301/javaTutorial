package tutorialFunc;
public class poly {
    public static void main(String[] args) {

        // polymorphism -> ability of an object to identify as more than one data type

        NavigationBoat navigationBoat = new NavigationBoat();
        WarShip warship = new WarShip();
        Submersible submersible = new Submersible();

        // multiple types in array, polymorphism required for var NavalEngagement
        // since all objects are subclasses of Ship parent class, they are also all of the Ship data type
        Ship[] navalEngagement = {navigationBoat, warship, submersible};

        // enhanced for loop to iterate and print
        for(Ship i : navalEngagement) {
            i.scout();
        }
    }
}

abstract class Ship {

    abstract void scout();
}

class NavigationBoat extends Ship {

    @Override
    public void scout() {
        System.out.println("Navigation boats scatter, navigatory scouts engaged");
    }
}

class WarShip extends Ship {

    @Override
    public void scout() {
        System.out.println("Warship engaged, fleet formation assembled");
    }
}

class Submersible extends Ship {

    @Override
    public void scout() {
        System.out.println("Submersibles engaged, underwater scouts engaged");
    }
}