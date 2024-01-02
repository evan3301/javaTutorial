package tutorialFunc;
public class methods {
    public static void main(String[] args) {

        // method -> block of code executed when called upon (aka a function)
        //           written outside of main method

        // no return type
        String name = "Michael";
        int age = 34;

        hello(name, age);

        // return type: sum -> int
        int x = 4;
        int y = 5;

        System.out.println(sum(x, y));
    }

    // returning void
    static void hello(String name, int age) {
        // System.out.printf("Hello %s, you are %d years old. \n", name, age);

    }

    // returning an integer
    static int sum(int x, int y) {
        return x + y;
    }

}