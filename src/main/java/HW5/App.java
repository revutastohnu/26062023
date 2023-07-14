package HW5;

public class App {
    public static void main(String[] args) {
        Drone drone = new Drone.Builder()
                .withName("Барсук")
                .withPrice(3000)
                .withWeapon(Drone.Weapon.GRENADE)
                .build();
    }
}