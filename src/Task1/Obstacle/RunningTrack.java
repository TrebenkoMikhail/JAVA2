package Task1.Obstacle;

import Task1.Participant.Participant;

public class RunningTrack implements Obstacle{
    private final int DISTANCE;

    public RunningTrack(int DISTANCE) {
        this.DISTANCE = DISTANCE;
    }

    @Override
    public boolean passObstacle(Participant participant) {
        if (DISTANCE < participant.run()) {
            System.out.printf("Участник %s успешно пробежал беговую дорожку длиной %d метров %n", participant, DISTANCE);
            return true;
        }
            System.out.printf("Участник %s не смог пробежать беговую дорожку длиной %d метров %n", participant, DISTANCE);
            return false;
        }
    }

