import java.util.Scanner;
//# 11 - Class Composition using a driver class
public class RoombaDriver {
    public static Roomba roomba;

    public static void main(String[] args) {
        roomba = new Roomba(14.0, 2, 0, 4, 1000, true, true, "RoboBot");

        System.out.println(roomba);
        roomba.raiseNameCase();
        System.out.println(roomba);
        roomba.lowerNameCase();
        System.out.println(roomba);
        roomba.simplifyName();
        System.out.println(roomba);
        // #17 - Scanner
        Scanner in = new Scanner(System.in);
        roomba.setVoltage(5.0);
        System.out.println("How many times will you drive?");
        int driveCounts = in.nextInt();
        System.out.println("How fast?");
        int speed = in.nextInt();
        // #18 - Nested for Loop
        for (int i = 0; i < driveCounts; i++) {
            for (int k = 0; i < roomba.getMotorCount(); k++) {
                roomba.drive(k, i, speed);
            }
        }

    }
}
