package ru.geekbrains.main.site.at;

public class Participants {
    String type;
    String name;
    public int distanceRun;
    public double jumpHeight;

    public String getName() {
        return name;
    }

    public void run (int lenth, String obstacleName) {
        if (distanceRun >= lenth) {
            System.out.println
                    (this.type + " " + this.name + " пробежал " + obstacleName + " длиной " + lenth + " км.");
        } else {
            System.out.println
                    (this.type + " " + this.name + " не смог пробежать " + obstacleName + " длиной " + lenth + " км.");
        }
    }

    public void jump (double heigth, String obstacleName) {
        if (jumpHeight >= heigth) {
            System.out.println
                    (this.type + " " + this.name + " перепрыгнул через " + obstacleName + " высотой " + heigth + " м.");
        } else {
            System.out.println
                    (this.type + " " + this.name + " не смог перепрыгнуть через " + obstacleName + " высотой " + heigth + " м.");
        }
    }
}
