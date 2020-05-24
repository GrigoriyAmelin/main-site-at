public class Robot {
    public String name;
    public int distanceRun;
    public double jumpHeight;

    public Robot (String name, int distanceRun, double jumpHeight) {
        this.name = name;
        this.distanceRun = distanceRun;
        this.jumpHeight = jumpHeight;
    }

    public void run () {
        System.out.println("Robot " + name + " can run on " + distanceRun + " kilometers!");
    }

    public void jump () {
        System.out.println("Robot " + name + " can jump on " + jumpHeight + " meters! You know!");
        System.out.println();
    }

}
