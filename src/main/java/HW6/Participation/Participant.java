package HW6.Participation;

public interface Participant {
        void run();
        void jump();
        boolean isDisqualified();
        int getMaxRun();
        int getMaxJump();
        void disqualify(boolean b);

}
