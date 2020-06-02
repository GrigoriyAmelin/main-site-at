package Example1;

public class Human extends Participants implements Actions {

    public Human (String type, String name, int distanceRun, double jumpHeight) {
        this.type = type;
        this.name = name;
        this.distanceRun = distanceRun;
        this.jumpHeight = jumpHeight;
    }

    public void run () {
        System.out.println("Человек " + name + " бегает на " + distanceRun + " км!");
    }

    public void jump () {
        System.out.println("Человек " + name + " прыгает на " + jumpHeight + " м. в высоту!");
    }

}
