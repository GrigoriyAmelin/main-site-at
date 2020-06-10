package ru.geekbrains.main.site.at;

public class Robot extends Participants implements Actions {

    public Robot (String type, String name, int distanceRun, double jumpHeight) {
        this.type = type;
        this.name = name;
        this.distanceRun = distanceRun;
        this.jumpHeight = jumpHeight;
    }

    public void run () {
        System.out.println("Robot " + name + " can run on " + distanceRun + " kilometers!");
    }

    public void jump () {
        System.out.println("Robot " + name + " can jump on " + jumpHeight + " meters! You know!");
    }

}
