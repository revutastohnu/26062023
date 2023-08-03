package HW8;

public class App {
    public static void main(String[] args) {
        Participant[] participants = new Participant[3];
        participants[0] = new Human("Саня", 100, 2, 10);
        participants[1] = new Cat("Васька", 200, 10,2);
        participants[2] = new Robot("R2D2", 200, 20, 1000);

        Obstacle[] obstacles = new Obstacle[2];
        obstacles[0] = new Racetrack(80);
        obstacles[1] = new Wall(3);

        for (Participant participant : participants) {
            for (Obstacle obstacle : obstacles) {
                if (!participant.isDisqualified()) {
                    boolean isOvercome = obstacle.overcome(participant);
                    if (isOvercome) {
                        System.out.println("Participant " + participant.getName() +
                                " passed obstacle " + obstacle.getClass().getSimpleName());
                    } else {
                        System.out.println("Participant " + participant.getName() +
                                " failed obstacle " + obstacle.getClass().getSimpleName());
                        break;
                    }
                }
            }
        }
    }
}
