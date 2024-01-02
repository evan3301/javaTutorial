package tutorialFunc;
// import Scanner module from java utility library
import java.util.Scanner;

public class usrInput {
    public static void main(String[] args){

        // create scanner
        Scanner myScanner = new Scanner(System.in);

        // prompt usr input
        System.out.println("Enter name: ");

        // scan next line for usr input
        String name = myScanner.nextLine();

        // output input value
        System.out.println("Hello " + name);


        System.out.println("Enter age: ");
        int age = myScanner.nextInt();
        System.out.println("You entered " + age);

        myScanner.close();
    }
}
