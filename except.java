package tutorialFunc;
import java.util.Scanner;
import java.util.InputMismatchException;

public class except {
    public static void main(String[] args) {

        // exception -> unexpected runtime errors (user entering wrong data type, etc.)

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter number to be divided:");
            int dividend = scanner.nextInt();

            System.out.println("Enter number to divide by:");
            int divisor = scanner.nextInt();

            int result = dividend / divisor;
            System.out.println("Result: " + result);

        } catch(InputMismatchException e) {
            System.out.println("Invalid input");
        } catch(ArithmeticException e) {
            System.out.println("Error, divided by zero");
        } catch(Exception e) {
            System.out.println("Something went wrong");
        } finally {
            System.out.println("Good-bye");
            scanner.close();
        }
    }
}