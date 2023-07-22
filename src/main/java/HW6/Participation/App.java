package HW6.Participation;

public class App {
    public static void main(String[] args) {
        Participant[] participants = new Participant[3];
        participants[0] = new Human("Саня", 100, 2);
        participants[1] = new Cat("Васька", 200, 3);
        participants[2] = new Robot("R2D2", 200, 20);

        Obstacle[] obstacles = new Obstacle[2];
        obstacles[0] = new Racetrack(80);
        obstacles[1] = new Wall(3);

        for (Participant participant : participants) {
            for (Obstacle obstacle : obstacles) {
                if (!participant.isDisqualified()) {
                    boolean isOvercome = obstacle.overcome(participant);
                    if (isOvercome) {
                        System.out.println("Participant " + participant.getClass().getSimpleName() +
                                " passed obstacle " + obstacle.getClass().getSimpleName());
                    } else {
                        System.out.println("Participant " + participant.getClass().getSimpleName() +
                                " failed obstacle " + obstacle.getClass().getSimpleName());
                        break;
                    }
                }
            }
        }
    }
}
