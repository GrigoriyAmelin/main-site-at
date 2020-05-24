package Example2;

public class Participant {
    private String name;
    private int distanceRun;
    private double jumpHeight;

   // public Participant(String name, int distanceRun, double jumpHeight) {
     //   this.name = name;
       // this.distanceRun = distanceRun;
        //this.jumpHeight = jumpHeight;
    //}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDistanceRun() {
        return distanceRun;
    }

    public void setDistanceRun(int distanceRun) {
        this.distanceRun = distanceRun;
    }

    public double getJumpHeight() {
        return jumpHeight;
    }

    public void setJumpHeight(double jumpHeight) {
        this.jumpHeight = jumpHeight;
    }
}
