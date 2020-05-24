package Example1;

public class Start {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Vasya", 2, 1.8);
        Cat cat2 = new Cat("Zheka", 3, 1.6);
        Human human1 = new Human("Kostya", 20, 1.5);
        Human human2 = new Human("Abdullah", 42, 1.2);
        Robot robot1 = new Robot("Verter", 100, 1.9);
        Robot robot2 = new Robot("Basya", 120, 2.1);

        cat1.run();
        cat1.jump();
        cat2.run();
        cat2.jump();

        human1.run();
        human1.jump();
        human2.run();
        human2.jump();

        robot1.run();
        robot1.jump();
        robot2.run();
        robot2.jump();
        System.out.println("It's a wonderful world!!!");
    }

}
