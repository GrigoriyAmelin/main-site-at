package Example1;

public class Tredmill extends Obstacles {
    public String name;
    public int lenth;

    public Tredmill (String name, int lenth) {
        this.name = name;
        this.lenth = lenth;
    }

    public String getName () {
        return name;
    }

    public int getLenth( ) {
        return lenth;
    }

    public void tredmillInfo () {
        System.out.println("Перед нами " + name + " длиной " + lenth + " км. Представь только!");
    }
}
