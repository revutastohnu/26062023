package HW8;

public class Human implements Participant {
    private int stamina;
    private String name;
        private int maxRun;
        private int maxJump;
        private boolean disqualified;

        public Human(String name, int maxRun, int maxJump, int stamina) {
            this.name = name;
            this.maxRun = maxRun;
            this.maxJump = maxJump;
            this.stamina = stamina;
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

    @Override
    public void disqualify(boolean disqualified) {
            this.disqualified = disqualified;
        }

    @Override
    public int getStamina() { return stamina; }
    @Override
    public void decreaseStamina(int staminaCost) {
        this.stamina -= staminaCost;
    }


    @Override
    public int getMaxRun() {
        return maxRun;
    }

    @Override
    public int getMaxJump() {
        return maxJump;
    }
    @Override
    public String getName() { return name; }
}
