package tutorialFunc;

public class varScope {
    public static void main(String[] args) {

        // local variable -> declared inside method; is only visible within that method
        // global variable -> declared outside method, within a class; visible to all of class

        numEx numEx = new numEx();
        numExTwo numExTwo = new numExTwo();
        numExThree numExThree = new numExThree();


        System.out.println(numEx.numMult());
        System.out.println(numExTwo.numMult());
        System.out.println(numExThree.numMult());

        // System.out.println(numExTwo.numDivide());
        // System.out.println(numExThree.numDivide());
    }
}


class numEx {

    // declare global variable
    private static int num = 47;

    int numAdd() {
        int newNumOne = num + num;
        // return local variable
        return newNumOne;
    }

    int numMult() {
        // call local variable for use in different method
        int newNumOne = numAdd();
        int newNumTwo = num * newNumOne;
        // return new local variable
        return newNumTwo;
    }

}

// childclass inhereting properties of superclass numEx
class numExTwo extends numEx{

    // unique method in child class
    int newNumOne = numAdd();
    int newNumTwo = numMult();

    int numDivide() {
        int newNumThree = newNumOne % newNumTwo;
        return newNumThree;
    }
}

// childclass inhereting properties of parent class numExTwo
class numExThree extends numExTwo{

}