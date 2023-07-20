package HW6.Participation;

public class Human implements Participant {
        private String name;
        private int maxRun;
        private int maxJump;
        private boolean disqualified;

        public Human(String name, int maxRun, int maxJump) {
            this.name = name;
            this.maxRun = maxRun;
            this.maxJump = maxJump;
        }

        @Override
        public void run() {
            System.out.println("Human " + name + " is running...");
        }

    @Override
    public void jump() {
        System.out.println("Human " + name + " jumps...");
    }

        @Override
        public boolean isDisqualified() {
            return disqualified;
        }

        public void disqualify(boolean disqualified) {
            this.disqualified = disqualified;
        }
    public int getMaxRun() {
        return maxRun;
    }

    public int getMaxJump() {
        return maxJump;
    }
}
