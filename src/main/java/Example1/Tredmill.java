package Example1;

public class Tredmill {
    public String name;
    public int lenth;

    public Tredmill (String name, int lenth) {
        this.name = name;
        this.lenth = lenth;
    }

    public int getLenth () {
        return lenth;
    }

    public void tredmillInfo () {
        System.out.println("Tredmill " + name + " lenth is " + lenth + " kilometers! You know!");
        System.out.println();
    }
}
