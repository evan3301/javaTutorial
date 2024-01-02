package tutorialFunc;
import java.util.Scanner;

public class polyDyna {
    public static void main(String[] args) {

        // dynamic polymorphism -> polymorphism post runtime

        Scanner scanner = new Scanner(System.in);
        Pill pill;

        System.out.println("Make a choice:");
        System.out.println("Press 1 for the Red Pill or press 2 for the Blue Pill");

        int choice = scanner.nextInt();

        // polymorphism via changing classes depending on user input
        if(choice == 1) {
            pill = new RedPill();
            pill.choose();
        } else if (choice == 2) {
            pill = new BluePill();
            pill.choose();
        } else {
            System.out.println("Bad choice");
        }

        scanner.close();
    }
}

abstract class Pill {

    abstract void choose();
}

class RedPill extends Pill {

    @Override
    public void choose() {
        System.out.println("You have chosen the Red Pill");
    }
}

class BluePill extends Pill {

    @Override
    public void choose() {
        System.out.println("You have chosen the Blue Pill");
    }
}