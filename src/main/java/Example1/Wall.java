package Example1;

public class Wall {
    public String name;
    public double height;

    public Wall (String name, double height) {
        this.name = name;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void wallInfo () {
        System.out.println("Wall " + name + " height is " + height + " meters! You know!");
        System.out.println();
    }
}
