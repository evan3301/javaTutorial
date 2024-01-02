package tutorialFunc;
public class methodOvl {
    public static void main(String[] args) {

        // overloaded method -> methods that have same names but different parameters

        double a = 4.0;
        double b = 5.0;
        double c = 6.0;

        System.out.println(sum(a, b, c));
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static double sum(double a, double b) {
        return a + b;
    }

    static double sum(double a, double b, double c) {
        return a + b + c;
    }
}
