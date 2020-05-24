package Example1;

public class Start {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Vasya", 2, 1.8);
        Human human1 = new Human("Kosta", 20, 1.5);
        Robot robot1 = new Robot("Verter", 100, 1.9);

        cat1.run();
        cat1.jump();

        human1.run();
        human1.jump();

        robot1.run();
        robot1.jump();
        System.out.println("It's a wonderful world!!!");
    }

}
