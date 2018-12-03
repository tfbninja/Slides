package s18_advoop;

class Monster1 {
    
    private int weight;
    
    public Monster1() {
        weight = 0;
    }
    
    public void setWeight(int w) {
        weight = w;
    }
    
    public int getWeight() {
        return weight;
    }
    
    public void print() {
        System.out.println("Monster's weight = " + weight);
    }
    
    @Override
    public String toString() {
        return "Weight: " + weight;
    }
}

public class MonsterOne {
    
    public static void main(String[] args) {
        Monster1 m = new Monster1();
        m.print();
        m.setWeight(279);
        System.out.println(m.toString());
        System.out.println("@" + m.hashCode());
    }
}
