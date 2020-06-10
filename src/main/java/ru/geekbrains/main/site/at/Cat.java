package ru.geekbrains.main.site.at;

public class Cat extends Participants implements Actions {


    public Cat(String type, String name, int distanceRun, double jumpHeight) {
        this.type = type;
        this.name = name;
        this.distanceRun = distanceRun;
        this.jumpHeight = jumpHeight;
    }

    public void jump () {
    }

    public void run () {
    }
}