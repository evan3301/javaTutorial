package tutorialFunc;
public class interfaces {
    public static void main(String[] args) {

        // interface -> a template that can be applied to a class
        //              multiple interfaces can be applied per class; whereas inheritence is linearly limited

        Warship warship = new Warship();
        Sailboat sailboat = new Sailboat();
        ComplexEngagement complexEngagement = new ComplexEngagement();

        // override methods for warship and sailboat classes
        warship.fight();
        sailboat.flee();

        System.out.println();

        // new override mthods for complexEngagement class, previous methods still sustained
        complexEngagement.fight();
        complexEngagement.flee();
    }
}

interface Prey {

    // interface methods do not need a body
    void flee();
}

interface Predator {

    void fight();
}

class Warship implements Predator {

    @Override
    public void fight() {
        System.out.println("Enemy detected, fight engaged");
    }
}

class Sailboat implements Prey {

    @Override
    public void flee() {
        System.out.println("Enemy detected, change course");
    }
}

// multiple interfaces per class
class ComplexEngagement implements Prey, Predator {

    @Override
    public void fight() {
        System.out.println("Enemy approaching, right side engagement");
    }

    @Override
    public void flee() {
        System.out.println("Navigation ship under attack, retreat");
    }
}