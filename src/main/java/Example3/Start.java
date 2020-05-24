package Example3;

public class Start {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Vasya", 5, 1.5);
        Human human1 = new Human("Kostya", 20, 1.5);
        Robot robot1 = new Robot("Verter", 200, 1.9);

        cat1.run();
        cat1.jump();

        human1.run();
        human1.jump();

        robot1.run();
        robot1.jump();
        System.out.println("It's the real world!!!");
    }

}
