package tutorialFunc;

public class constructorOvl {
    public static void main(String[] args) {

        // overloaded constructor -> multiple constructors within class; same names, different parameters

        // name + parameters = signature -> overloaded constructors have different signatures within a class
        //                          note that signatures only consider the number of parameters and their types
        //                              a unique constructor has a unique number / type of parameters


        // create instance of class, parameters must match one constructor
        // attempt to call variable not included in this constructor will result in null
        Human humanOne = new Human(72, 190.72, "Mexican", "Marino");
        System.out.printf("Release human one:\n" +
                           "Height(inches): %d\n" +
                           "Weight(Pounds): %.2f\n" +
                           "Ethnicity: %s\n" +
                           "Name: %s\n" +
                           "Diseases: %s\n" ,
                           humanOne.height, humanOne.weight, humanOne.ethnicity, humanOne.name, humanOne.disease);

        System.out.println();

        // create instance of class, parameters must match one constructor
        Human humanTwo = new Human(65, 140.6, "White", "Jonathan", "Ghonnorhea, Arthiritis, Severe nausea");
        System.out.printf("Release human two:\n" +
                           "Height(inches): %d\n" +
                           "Weight(Pounds): %.2f\n" +
                           "Ethnicity: %s\n" +
                           "Name: %s\n" +
                           "Diseases: %s\n" ,
                           humanTwo.height, humanTwo.weight, humanTwo.ethnicity, humanTwo.name, humanTwo.disease);

        System.out.println();

        // create instance of class, parameters must match one constructor
        Human humanThree = new Human(65, 140.6, "Schizophrenia, Multiple personality disorder");
        System.out.printf("Release human three:\n" +
                           "Height(inches): %d\n" +
                           "Weight(Pounds): %.2f\n" +
                           "Ethnicity: %s\n" +
                           "Name: %s\n" +
                           "Diseases: %s\n" ,
                           humanThree.height, humanThree.weight, humanThree.ethnicity, humanThree.name, humanThree.disease);
    }
}

class Human {

    // list all variables(with their data types) that are to be used
    int height;
    double weight;
    String ethnicity;
    String name;
    String disease;

    // constructor one with relevant parameters
    Human(int height, double weight, String ethnicity, String name) {

        this.height = height;
        this.weight = weight;
        this.ethnicity = ethnicity;
        this.name = name;
    }

    // constructor two with relevant parameters
    Human(int height, double weight, String ethnicity, String name, String disease) {

        this.height = height;
        this.weight = weight;
        this.ethnicity = ethnicity;
        this.name = name;
        this.disease = disease;
    }

    // constructor three with relevant parameters
    Human(int height, double weight, String disease) {

        this.height = height;
        this.weight = weight;
        this.disease = disease;
    }

}