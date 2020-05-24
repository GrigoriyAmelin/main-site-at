package Example2;

public class Start {
    public static void main(String[] args) {
        Cat cat1 = new Cat ();
        cat1.setName("Vasya");
        cat1.setDistanceRun(5);
        cat1.setJumpHeight(1.5);

        Human human1 = new Human ();
        human1.setName("Kosta");
        human1.setDistanceRun(20);
        human1.setJumpHeight(1.5);

        Robot robot1 = new Robot ();
        robot1.setName("Verter");
        robot1.setDistanceRun(200);
        robot1.setJumpHeight(1.9);

        cat1.run();
        cat1.jump();

        human1.run();
        human1.jump();

        robot1.run();
        robot1.jump();
        System.out.println("It's amazing world!!!");
    }

}
