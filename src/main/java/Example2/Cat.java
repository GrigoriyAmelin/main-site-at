package Example2;

public class Cat extends Participant {
    public void run () {
        System.out.println("Cat " + super.getName() + " can run on " + super.getDistanceRun() + " kilometers!");
    }

    public void jump () {
        System.out.println("Cat " + super.getName() + " can jump on " + super.getJumpHeight() + " meters! You know!");
        System.out.println();
    }
}
