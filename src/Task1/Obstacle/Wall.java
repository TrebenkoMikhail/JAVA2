package Task1.Obstacle;

import Task1.Participant.Participant;

public class Wall implements Obstacle {

    private final int height;

    public Wall(int high) {
        this.height = high;
    }

    @Override
    public boolean passObstacle(Participant participant) {
        if (height > participant.jump()) {
            System.out.printf("Участник %s успешно перепрыгнул стену высотой %d метров %n", participant, height);
        }
            System.out.printf("Участник %s не смог перепрыгнуть стену высотой %d метров %n", participant, height);
            return false;
        }
    }

