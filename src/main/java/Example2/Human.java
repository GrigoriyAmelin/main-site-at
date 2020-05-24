package Example2;

public class Human extends Participant {
    public void run () {
        System.out.println("Human " + super.getName() + " can run on " + super.getDistanceRun() + " kilometers!");
    }

    public void jump () {
        System.out.println("Human " + super.getName() + " can jump on " + super.getJumpHeight() + " meters! You know!");
        System.out.println();
    }

}
