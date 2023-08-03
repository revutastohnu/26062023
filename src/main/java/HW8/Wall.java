package HW8;

public class Wall implements Obstacle {
    private int height;
    private final int STAMINA_COST = 2;

    public Wall(int height) {
        this.height = height;
    }
    @Override
    public boolean overcome(Participant participant) {
        participant.jump();
        if (participant.getMaxJump() >= height && participant.getStamina() >= STAMINA_COST) {
            participant.decreaseStamina(STAMINA_COST);
            return true;
        } else {
            participant.disqualify(true);
            return false;
        }
    }
}

