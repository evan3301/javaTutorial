package tutorialFunc;
public class staticKey {
    public static void main(String[] args) {

        // static -> modifier applied to variables / method
        //           class 'owns' static member (rather than instances of the class)

        Watch watchOne = new Watch("Jonathan Mayers");
        Watch watchTwo = new Watch("James McKinney");
        Watch watchThree = new Watch("Patrick Hayes");

        System.out.printf("Suspect List: \n%s\n%s\n%s\n", watchOne, watchTwo, watchThree);

        // static member does not have to be called via an instance
        System.out.printf("Number of Suspects: %d\n", Watch.watchNum);
    }
}

class Watch {

    String name;
    static int watchNum;

    Watch(String name) {
        this.name = name;
        // static member is incremented per object
        watchNum++;
    }

    public String toString() {
        return name;
    }
}