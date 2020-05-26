public class Robot {
    protected Motor[] motors;

    public Robot(int motorCount) {
        motors = new Motor[motorCount];
    }
    public void stopMotors() {
        for (Motor m : motors) {
            m.setSpeed(0);
        }
    }
}
