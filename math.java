package tutorialFunc;
import java.util.Scanner;
import java.util.Random;

public class math {
    public static void main(String [] args){

        // basic implementation of floats and doubles
        double x = 3.14;
        float y = 2.526f;

        System.out.println("Max: " + Math.max(x, y));
        System.out.println("Min: " + Math.min(x, y));

        System.out.println("Square root of x: " + Math.sqrt(x));

        System.out.println("Rounded y: " + Math.round(y));
        System.out.println("Rounded up y: " + Math.ceil(y));
        System.out.println("Rounded down y: " + Math.floor(y));


        // implementation to find hypotneuse
        double a;
        double b;
        double c;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter side a: ");
        a = scanner.nextDouble();

        System.out.println("Please enter side b: ");
        b = scanner.nextDouble();

        c = Math.sqrt((a*a) + (b*b));
        System.out.println("Hypotneuse: " + c);

        scanner.close();

        // random class implementation
        Random random = new Random();

        // set rand range
        int i = random.nextInt(6)+1;
            System.out.println(i);

        boolean j = random.nextBoolean();
            System.out.println(j);
    }
}
