package tutorialFunc;
public class string {
    public static void main(String [] args){

        String name = " Base ";

        boolean outcome_1 = name.equals("base");    // returns boolean

        boolean outcome_2 = name.equalsIgnoreCase("Base");

        int outcome_3 = name.length();

        char outcome_4 = name.charAt(0);

        int outcome_5 = name.indexOf("s");

        boolean outcome_6 = name.isEmpty();

        String outcome_7 = name.toUpperCase();

        String outcome_8 = name.toLowerCase();

        String outcome_9 = name.trim();

        String outcome_10 = name.trim().replace('e', 's');

        String outcome_11 = name.trim().toUpperCase().replace('E', 'S');

        // store variables in a mixed array via Object[] array
        // print via indexing
        Object[] outcomes = {outcome_1, outcome_2, outcome_3, outcome_4, outcome_5,
                             outcome_6, outcome_7, outcome_8, outcome_9, outcome_10, outcome_11};
        System.out.println(outcomes[8]);
    }
}