package s20_inheritance;
//inheritance example

import static java.lang.System.*;

class Monster1 {

    private String myName = "long way to go for a toString()";

    public Monster1() {
        myName = "Monster reee";    //uncomment and recompile and run
    }

    public Monster1(String name) {
        myName = name;
    }

    public String toString() {
        return myName;
    }
}

class Witch1 extends Monster1 {

    public Witch1() //GoodWitch will not compile without this constructor
    {
        super();
    }

    public Witch1(String name) {
        super(name);
    }
}

class GoodWitch extends Witch1 {
    //what do we need here??

    public GoodWitch() {
        super();
    }

    public GoodWitch(String name) {
        super(name);
    }
}

public class WhatsOnTheInside {

    public static void main(String[] args) {
        GoodWitch bad = new GoodWitch();		//why does this not compile
        out.println(bad);

        GoodWitch witch = new GoodWitch("Harriet");
        out.println(witch);
    }
}
