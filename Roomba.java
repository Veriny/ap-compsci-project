import javax.crypto.Mac;

public class Roomba extends Robot implements Machine {

    // #9, #3 - Initialize instance variables, one of each primitive data type.
    private double voltage, speedScale, speed;
    private int distanceTraveled, motorCount, batteryCycle;
    private boolean isCharging, isOn;
    private String nameOfRobot;
    // #12 - Array in student designed class



    // #9 - Constructors
    public Roomba(double voltage, double speedScale, int distanceTraveled, int motorCount, int batteryCycle, boolean isCharging, boolean isOn, String nameOfRobot) {
        super(motorCount);
        this.voltage = voltage;
        this.speedScale = speedScale;
        this.distanceTraveled = distanceTraveled;
        this.motorCount = motorCount;
        this.batteryCycle = batteryCycle;
        this.isCharging = isCharging;
        this.isOn = isOn;
        speed = 0;
        this.nameOfRobot = nameOfRobot;
        // #12 - Array traversed with for loop
        for (int i = 0; i < motorCount; i++) {
            motors[i] = new Motor(0, 1, voltage);
        }
    }

    public Roomba() {
        voltage = 14.0;
        speedScale = 1.0;
        distanceTraveled = 0;
        motorCount = 4;
        batteryCycle = 0;
        isCharging = false;
        isOn = false;
        speed = 0;
    }

    //#9, #10a - Getters
    public double getVoltage() {
        return voltage;
    }

    public double getSpeedScale() {
        return speedScale;
    }

    public int getDistanceTraveled() {
        return distanceTraveled;
    }

    public int getMotorCount() {
        return motorCount;
    }

    public int getBatteryCycle() {
        return batteryCycle;
    }

    // #9, #10b - Setters
    public void setVoltage(double voltage) {
        this.voltage = voltage;
    }

    public void setSpeedScale(double speedScale) {
        this.speedScale = speedScale;
    }

    // #9, #10d - Processor Methods
    public void recalculateSpeed(int s) {
        // #6 - Math.pow
        speed = Math.pow(s, speedScale);
    }

    public void overChargeVoltage() {
        // #6 - Math.random
        voltage = Math.random() * 100000000;
    }

    public void simplifyName() {
        // #7 - String method (w/ substring)
        this.nameOfRobot = nameOfRobot.substring(0, nameOfRobot.length() / 2);
    }

    public void raiseNameCase() {
        // #7 - String Method
        this.nameOfRobot = nameOfRobot.toUpperCase();
    }

    public void lowerNameCase() {
        // #7 - String Method
        this.nameOfRobot = nameOfRobot.toLowerCase();
    }

    public int returnEstimatedVoltage() {
        // #8 - Casting
        int answer = (int) voltage;
    }

    // #10c - Pair of overloaded methods
    public void drive (int ticks, int voltage, int speed) {
        // #2, #1 - If statement (+ one with throw exception), Relational Operator
        if (voltage < 0) {
            throw new IllegalArgumentException("Voltage cannot be negative.");
            return;
        }

        this.voltage = voltage;

        if (isOn) {
            distanceTraveled += ticks * this.voltage;
            recalculateSpeed(speed)
            for (int i = 0; i < motorCount; i++) {
                motors[i].setSpeed((int)this.speed);
            }
        }
        else {
            distanceTraveled += 0;
        }
        for (int i = 0; i < motorCount; i++) {
            motors[i].setSpeed(0);
        }
    }

    public void drive (int ticks) {
        // #2, #1 - If statement (+ one with throw exception), Relational Operator
        if (isOn == true) {
            distanceTraveled += ticks * voltage;
        }
        else {
            distanceTraveled += 0;
        }
    }

    //#10c, #10d - overloaded and student designed methods
    public void resetPower(double newVoltage) {
        this.voltage = newVoltage;
    }
    public void resetPower() {
        this.voltage = 0;
    }

    public void setStatus(String str) {
        // #5 - switch statment
        switch (str.toLowerCase()) {
            case "on":
                isOn = true;
                break;
            case "off":
                isOn = false;
                break;
            case "charging":
                isCharging = true;
                isOn = true;
                break;
            default:
                throw new IllegalArgumentException("Invalid Status");
        }
        // #1 - Logical Operators
        if (!(voltage != 0) && !isCharging) {
            isOn = false;
        }
    }



    //#9 ToString
    public String toString() {
        String str =  "voltage=" + voltage +
                ", speedScale=" + speedScale +
                ", speed=" + speed +
                ", distanceTraveled=" + distanceTraveled +
                ", motorCount=" + motorCount +
                ", batteryCycle=" + batteryCycle +
                ", isCharging=" + isCharging +
                ", isOn=" + isOn;
        return str;

    }

    @Override
    public void turnOn() {
        isOn = true;
    }

    @Override
    public void stopMotors() {
        super.stopMotors();
    }
}
