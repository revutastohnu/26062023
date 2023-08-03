package HW8;

public interface Participant {
        void run();
        void jump();
        boolean isDisqualified();

        void decreaseStamina(int staminaCost);

        int getMaxRun();
        int getMaxJump();
        void disqualify(boolean b);
        int getStamina();

        String getName();
}
