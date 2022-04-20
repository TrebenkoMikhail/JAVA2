package Task1.Participant;

import Task1.Obstacle.Obstacle;
import Task1.Obstacle.RunningTrack;
import Task1.Obstacle.Wall;

public class Main {



    public static void main(String[] args) {

        Cat cat = new Cat("Murzik");
        Human human = new Human("Grigorii");
        Robot bot = new Robot("Bender");

        RunningTrack track = new RunningTrack(150);
        Wall wall = new Wall(10);

        Participant [] participants = {human, cat, bot};
        Obstacle [] obstacle = {wall, track};

        for (Participant participant : participants) {
            for (Obstacle obstacles : obstacle) {
                if (!obstacles.passObstacle(participant)) {
                    System.out.printf("Участник %s выбывает из соревнований %n", participant);
                }
            }
        }
    }

}
