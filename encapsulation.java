package tutorialFunc;
public class encapsulation {
    public static void main(String[] args) {

        // encapsulation -> attributes of a class are hidden or private
        //                  can be accessed via getter and setter methods

        Inmate inmateOne = new Inmate("Joseph Cavarro", 47, "Triple Homocide", 56.8);
        //Inmate inmateTwo = new Inmate("Temofe Tumbarello", 66, "Solicitation", 60);

        // setter method
        // System.out.println("Previous sentence: " + inmateOne.getSentence());
        // inmateOne.setSentence(999);
        // System.out.println("Sentence has been extended to: " + inmateOne.getSentence());

        // copy method
        //inmateTwo.copy(inmateOne);

        // copy constructor method
        Inmate inmateTwo = new Inmate(inmateOne);

        System.out.println(inmateTwo.getName());
        System.out.println(inmateTwo.getAge());
        System.out.println(inmateTwo.getCrime());
        System.out.println(inmateTwo.getSentence());


    }
}

class Inmate {

    // it is good practice to always have private variables unless needed otherwise
    private String name;
    private int age;
    private String crime;
    private double sentence;

    Inmate(String name, int age, String crime, double sentence) {
        // constructor instances can be replaced by setter method instances
        this.setName(name);
        this.setAge(age);
        this.setCrime(crime);
        this.setSentence(sentence);
    }

    // overloaded method; copy constructor
    Inmate(Inmate inmateOne) {
        this.copy(inmateOne);        // call copy constructor from below
    }

    // getter methods -> retrieve private variables
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getCrime() {
        return crime;
    }
    public double getSentence() {
        return sentence;
    }

    // setter methods -> change contents of private variables
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setCrime(String crime) {
        this.crime = crime;
    }
    public void setSentence(double sentence) {
        this.sentence = sentence;
    }

    // copy method
    public void copy(Inmate inmateOne) {
        this.setName(inmateOne.getName());      // 'this' refers to inmateTwo, the one invoking the copy method
        this.setAge(inmateOne.getAge());
        this.setCrime(inmateOne.getCrime());
        this.setSentence(inmateOne.getSentence());
    }
}