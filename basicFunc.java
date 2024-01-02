package tutorialFunc;
public class basicFunc {
    public static void main(String[] args){

        // type declaration
        // semi-colon termination
        int x = 1;

        /*
         * Other types include:
         * float
         * double
         * boolean
         * char
         * String
         */

        // string concatenation
        System.out.println("My number is: " +x);

        // swap via temp var
        int y = 2;
        int temp = x;

        x = y;
        y = temp;

        System.out.println("My number is: " +x);

        // fstring
        System.out.printf("My number is: %d \n", x);
   }
}
