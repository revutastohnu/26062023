package HW6.Participation;

public class Racetrack implements Obstacle{
    private int distance;
    public Racetrack(int distance){
        this.distance = distance;
    }
    @Override
    public boolean overcome(Participant participant) {
        participant.run();
        if (participant.getMaxRun() >= distance) {
            return true;
        } else {
            participant.disqualify(true);
            return false;
        }
    }
}
