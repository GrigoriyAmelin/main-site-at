package Example1;

public class Wall extends Obstacles {
    public String name;
    public double height;

    public Wall (String name, double height) {
        this.name = name;
        this.height = height;
    }

    public String getName () {
        return name;
    }

    public double getHeight () {
        return height;
    }

    public void wallInfo () {
        System.out.println("Прямо здесь " + name + " высотой " + height + " м.! Очуметь - не встать!");
    }
}
