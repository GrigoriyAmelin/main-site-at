package Example3;

public class Human extends Participant {
    public Human (String name, int distanceRun, double jumpHeight) {
        super(name, distanceRun, jumpHeight);
    }

    public void run () {
        System.out.println("Human " + super.getName() + " can run on " + super.getDistanceRun() + " kilometers!");
    }

    public void jump () {
        System.out.println("Human " + super.getName() + " can jump on " + super.getJumpHeight() + " meters! You know!");
        System.out.println();
    }

}
