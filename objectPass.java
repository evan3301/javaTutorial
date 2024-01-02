package tutorialFunc;
public class objectPass {
    public static void main(String[] args) {

        Body body = new Body();

        Organ organOne = new Organ("Liver");
        Organ organTwo = new Organ("Heart");

        body.implant(organOne);
        body.implant(organTwo);
    }
}

class Body {

    // pass object organ to body via data type Organ
    void implant(Organ organ) {
        System.out.printf("%s transplant successful\n", organ.donorOrgan);
    }
}


class Organ {

    String donorOrgan;

    Organ(String donorOrgan) {
        this.donorOrgan = donorOrgan;
    }
}