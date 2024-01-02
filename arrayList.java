package tutorialFunc;
import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {

        // wrapper class -> allows for conversions of primitive data types to reference data types

        /* primitive         * reference
           --------            --------
         * boolean           * Boolean
         * char              * Character
         * int               * Integer
         * double            * Double
         */


        //--------------------------------------------------------------------


        // ArrayList is a resizable array
        // only stores reference data types, appropriate wrapper must be used

        ArrayList<Integer> nums = new ArrayList<Integer>();

        nums.add(2);
        nums.add(4);
        nums.add(6);
        nums.add(8);

        // replaces index with provided value
        nums.set(0, 1);
        // removes index
        nums.remove(2);
        // clears whole array
        nums.clear();

        for(int i=0; i<nums.size(); i++) {
            System.out.println(nums.get(i));
        }


        // 2 dimensional ArrayList
        ArrayList<String> woods = new ArrayList<String>();

        woods.add("oak");
        woods.add("pine");
        woods.add("birch");

        ArrayList<String> stones = new ArrayList<String>();

        stones.add("granite");
        stones.add("marble");
        stones.add("limestone");

        ArrayList<String> spices = new ArrayList<String>();

        spices.add("cardimum");
        spices.add("clove");

        // create 2D ArrayList
        ArrayList<ArrayList<String>> nature = new ArrayList<ArrayList<String>>();

        // add ArrayLists to 2D ArrayList
        nature.add(woods);
        nature.add(stones);
        nature.add(spices);

        // display entire 2D ArrayList
        System.out.println(nature);
        // display specific index of 2D ArrayList
        System.out.println(nature.get(2));
        // display specific index of specifix list in 2D ArrayList
        System.out.println(nature.get(2).get(1));

    }
}
