package tutorialFunc;
import java.util.Random;
import java.util.Scanner;

public class loops {
    public static void main(String[] args) {

        // logical operators
        /*
         *  &&  = (AND) both conditions must be true
         *  || = (OR) either condition must be true
         *  ! = (NOT) reverses boolean value of condition
         */


        // if else loop
        Random random = new Random();
        int age = random.nextInt(20);
        if(age >= 18) {
            // System.out.println("True");
        } else {
            // System.out.println("False");
        }


        // while loop
        int newAge = 4;

        while(newAge <= 20) {
            newAge ++;
        }
        // System.out.println(age);


        // for loop
        for(int i = 0; i <= 10; i += 2) {
            // System.out.println(i);
        }


        // nested loop
        Scanner scanner = new Scanner(System.in);
        int rows;
        int columns;
        String symbol = "";

        System.out.println("Enter rows:");
        rows = scanner.nextInt();

        System.out.println("Enter columns:");
        columns = scanner.nextInt();

        System.out.println("Enter symbol:");
        symbol = scanner.next();

        for (int i=1; i<=rows; i++) {
            System.out.println();
            for (int j=1; j<=columns; j++) {
                System.out.print(symbol);
            }
        }
        System.out.print("\n");

        scanner.close();


        // switch implementation -> check for equality
        /*
        Random random = new Random();
        int age = random.nextInt(20)+12;

        switch(age) {
            case 13: System.out.println("New teenager");
            break;
            case 16: System.out.println("Sweet sixteen");
            break;
            case 20: System.out.println("Adult");
            break;
            default: System.out.println("Happy birthday");
        }
        */

    }
}
