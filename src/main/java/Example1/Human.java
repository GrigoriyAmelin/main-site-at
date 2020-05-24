package Example1;

public class Human {
    public String name;
    public int distanceRun;
    public double jumpHeight;

    public Human (String name, int distanceRun, double jumpHeight) {
        this.name = name;
        this.distanceRun = distanceRun;
        this.jumpHeight = jumpHeight;
    }

    public void run () {
        System.out.println("Human " + name + " can run on " + distanceRun + " kilometers!");
    }

    public void jump () {
        System.out.println("Human " + name + " can jump on " + jumpHeight + " meters! You know!");
        System.out.println();
    }

}
