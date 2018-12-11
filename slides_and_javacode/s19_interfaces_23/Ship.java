package s19_interfaces_23;

// A+ Computer Science
// www.apluscompsci.com
//interface example
public class Ship implements Locatable, Movable {

    private int xPos, yPos;

    public Ship() {
        xPos = yPos = 0;
    }

    public Ship(int x, int y) {
        xPos = x;
        yPos = y;
    }

    public void setX(int x) {
        this.xPos = x;
    }

    public void setY(int y) {
        this.yPos = y;
    }

    public void setPos(int x, int y) {
        setX(x);
        setY(y);
    }

    public int getX() {
        return this.xPos;
    }

    public int getY() {
        return this.yPos;
    }

    //add get methods - use Locatable interface
    public boolean equals(Object obj) {
        Ship other = (Ship) obj;
        if (xPos == other.xPos && yPos == other.yPos) {
            return true;
        }
        return false;
    }

    public String toString() {
        return " " + xPos + " " + yPos;
    }
}
