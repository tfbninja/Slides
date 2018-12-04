package s18_array_of_refs;

// A+ Computer Science
// www.apluscompsci.com
//array of references as instance variable example
import static java.lang.System.*;
import java.util.Arrays;
import java.util.Collections;

public class Herd {

    private Creature[] creatureList;

    public Herd() {
        creatureList = new Creature[10];
    }

    public Herd(int size) {
        this.creatureList = new Creature[size];
    }

    public void add(int Herdsize) {
        int index = 0;
        for (Creature i : this.creatureList) {
            if (i == null) {
                break;
            } else {
                index++;
            }
        }
        this.creatureList[index] = new Creature(Herdsize);
    }

    public String toString() {
        return "" + Arrays.toString(creatureList);
    }
}
