package tutorialFunc;
public class methodOvr {
    public static void main(String[] args) {

        // method override -> declaring method in subclass, while it is already present in a parent class
        //                    allows for unique implementation in child class

        Bear bear = new Bear("Brown bear", 6, "Salmon");

        // bear.sleep();
        System.out.println(bear.toString());
    }
}

class Mammal {

    String species;
    int age;

    Mammal(String species, int age) {
        this.species = species;
        this.age = age;
    }

    void sleep() {
        System.out.println("Sleeping");
    }

    public String toString() {
        return this.species+"\n" + this.age+"\n";
    }
}

class Bear extends Mammal {

    String prey;

    // super() refers back to superclass; inherits specified attributes from superclass constructor
    Bear(String species, int age, String prey) {
        super(species, age);
        this.prey = prey;
    }

    @Override       // convention; note for clarity
    void sleep() {
        System.out.println("Hybernate");
    }

    // call super() to copy previous toString method
    public String toString() {
        return super.toString() + this.prey+"\n";
    }
}