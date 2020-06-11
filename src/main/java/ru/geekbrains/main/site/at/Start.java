package ru.geekbrains.main.site.at;

public class Start {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Кот","Вася", 2, 3.2);
        Cat cat2 = new Cat("Котик","Жека", 32, 2.6);
        Human human1 = new Human("Человек","Константин", 31, 1.5);
        Human human2 = new Human("Человечище","Абдулла", 42, 2.1);
        Robot robot1 = new Robot("Робот","Вертер", 100, 3.9);
        Robot robot2 = new Robot("Роботяга","АрДваДэДва", 120, 2.1);
        Tredmill tredmill1 = new Tredmill("Тредмилл соседа", 30);
        Tredmill tredmill2 = new Tredmill("Мой тредмилл", 103);
        Wall wall1 = new Wall("Дачная стенка", 3.1);
        Wall wall2 = new Wall("Кремлевская стена", 2.05);

        wall1.wallInfo();
        wall2.wallInfo();

        tredmill1.tredmillInfo();
        tredmill2.tredmillInfo();
        System.out.println();

        Obstacles[] obstaclesArr = new Obstacles[]{tredmill1, tredmill2, wall1, wall2};
        Participants[] participantArr = {cat1, cat2, human1, human2, robot1, robot2};
        System.out.println
                ("Кол-во участников: " + participantArr.length + ", кол-во препятствий: "+ obstaclesArr.length + ".");
        System.out.println();

        for (Participants participants : participantArr) {
            for (Obstacles obstacles : obstaclesArr) {
                if (obstacles instanceof Wall) {
                    participants.jump (((Wall) obstacles).getHeight(), ((Wall)obstacles).getName());
                } else {
                    if (obstacles instanceof Tredmill) {
                        participants.run(((Tredmill) obstacles).getLenth(), ((Tredmill)obstacles).getName());
                    }
                }
            }
        }
        System.out.println();
        System.out.println("Удивительный мир, и куда он катится!?");
    }
}

