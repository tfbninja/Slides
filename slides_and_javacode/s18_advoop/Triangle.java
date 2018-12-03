package s18_advoop;

public class Triangle {

    private int sideA, sideB, sideC;

    public Triangle() {
        setSides(0, 0, 0);
    }

    public Triangle(int a, int b, int c) {
        this.sideA = a;
        this.sideB = b;
        this.sideC = c;
    }

    public void setSides(int a, int b, int c) {
        this.sideA = a;
        this.sideB = b;
        this.sideC = c;
    }

    public void setSideA(int a) {
        sideA = a;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideB(int b) {
        sideB = b;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideC(int c) {
        sideC = c;
    }

    public int getSideC() {
        return sideC;
    }

    public double getArea() {
        double s = 0.5 * (getSideA() + getSideB() + getSideC());
        return Math.sqrt(s * (s - getSideA()) * (s - getSideB()) * (s - getSideC()));
    }

    public String toString() {
        return "Side a: " + this.sideA + ", side b: " + this.sideB + ", side c: " + this.sideC + ", area: " + getArea();
    }
}
