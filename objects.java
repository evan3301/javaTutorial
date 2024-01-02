package tutorialFunc;
public class objects {
    public static void main(String[] args) {

        // object -> class instance with attributes and methods

        // create instance of class
        cube myCube = new cube();


        // access elements of class
        // System.out.println(myCube.sides);

        int[] attributes = {myCube.sides, myCube.corners, myCube.edges};
        for(int i : attributes) {
            System.out.println(i);
        }

        // System.out.println(attributes[2]);

        // access elements via implicit toString method
        // System.out.print(myCube);


        // invoke methods within class
        // myCube.toss();
    }
}

class cube {

    int sides = 6;
    int corners = 8;
    int edges = 12;

    void toss() {
        System.out.println("Your cube accelerates unidirectionally");
    }

    void place() {
        System.out.println("Your cube is stationary");
    }

    // modify toString method to have textual representation of class
    public String toString() {
        return sides+"\n" + corners+"\n" + edges+"\n";
    }
}