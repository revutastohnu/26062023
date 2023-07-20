package HW6.Participation;

public class Wall implements Obstacle{
    private int height;

    public Wall(int height) {
        this.height = height;
    }
    @Override
    public boolean overcome(Participant participant) {
        participant.jump();
        if (participant.getMaxJump() >= height) {
            return true;
        } else {
            participant.disqualify(true);
            return false;
        }
    }
}

