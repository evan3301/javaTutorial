package tutorialFunc;
public class abstraction {
    public static void main(String[] args) {

        // abstract -> class that cannot be instantiated ('new' keyword) but can have a subclass
        //             method that is declared without implementation

        // Mammal mammal = new Mammal();        abstract class cannot be instantiated
        Bear bear = new Bear();
        bear.eat();
    }
}

abstract class Mammal {

    // abstract methods cannot have a body, and must be overridden in a subclass
    abstract void eat();
}

class Bear extends Mammal {

    @Override
    void eat() {
        System.out.println("Bear is eating");
    }
}