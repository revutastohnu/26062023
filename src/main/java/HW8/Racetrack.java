package HW8;

public class Racetrack implements Obstacle {
    private int distance;
    private final int STAMINA_COST = 3;
    public Racetrack(int distance){
        this.distance = distance;
    }
    @Override
    public boolean overcome(Participant participant) {
        participant.run();
        if (participant.getMaxRun() >= distance && participant.getStamina() >= STAMINA_COST) {
            participant.decreaseStamina(STAMINA_COST);
            return true;
        } else {
            participant.disqualify(true);
            return false;
        }
    }
}
