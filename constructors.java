package tutorialFunc;
public class constructors {
    public static void main(String[] args) {

        // constructor -> method that is called upon when object is instantiated (created)

        human human_one = new human("Jon", 47, 179.806);
        human human_two = new human("Jane", 36, 135.849);


        System.out.println(human_one.age);
        System.out.println(human_two.weight);

        human_one.walk();
        human_two.weight();
    }
}

class human {

    // create variables, set data types
    String name;
    int age;
    double weight;

    // constructor to serve as template for human
    human(String name, int age, double weight) {

        // 'this' keyword to assign attributes
        // 'this' serves as stand in for human_one, human_two etc.
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    void walk() {
        System.out.printf("%s is eating \n", this.name);
    }

    void weight() {
        System.out.printf("%s weighs in at %.2f pounds today \n", this.name, this.weight);
    }

}