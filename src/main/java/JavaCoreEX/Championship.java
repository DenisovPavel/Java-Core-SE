package JavaCoreEX;

public class Championship {

    public static void main(String[] args) {

        Runner[] runners = {
          new Cat("Барсик", 1500, 300),
          new Cat("Персик", 1700, 220),
          new Robot("RD2D2", 99999, 0),
          new Robot("C3PO", 5000, 50),
          Human.create("Петр", 32, 2500, 300),
          Human.create("Василий", 22, 3500, 120),
        };

        Obstacle[] obstacles = {
                new Track(1200),
                new Wall(30),
                new Track(2000),
                new Wall(140),
                new Track(2100),
                new Wall(290),
        };

        for (Runner runner : runners){
            for (Obstacle obstacle : obstacles){
                if (obstacle instanceof Track){
                    if (!runner.run(obstacle.length))
                        break;
                }
                if (obstacle instanceof Wall){
                    if (!runner.jump(obstacle.height))
                        break;
                }
            }
        }
    }
}
