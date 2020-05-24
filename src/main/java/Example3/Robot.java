package Example3;

public class Robot extends Participant {

    public Robot (String name, int distanceRun, double jumpHeight) {
        super(name, distanceRun, jumpHeight);
    }
    public void run () {
        System.out.println("Robot " + super.getName() + " can run on " + super.getDistanceRun() + " kilometers!");
    }

    public void jump () {
        System.out.println("Robot " + super.getName() + " can jump on " + super.getJumpHeight() + " meters! You know!");
        System.out.println();
    }

}
