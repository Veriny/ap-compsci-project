import java.util.ArrayList;
import java.util.Arrays;

public class Motor {
    private ArrayList<Double> possibleVoltages;
    private int speed, direction;

    public Motor(int speed, int direction, double voltage) {
        this.speed = speed;
        this.direction = direction; //1 for forward, -1 for backward
        possibleVoltages = new ArrayList<Double>();
        possibleVoltages.add(voltage);
        possibleVoltages.add(5.0);
        possibleVoltages.add(7.0);
    }


    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed * direction;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public void addVoltageRange(int voltage) {
        //#4 - Do while
        do {
            possibleVoltages.add((double)voltage);
            voltage--;
        }
        while (voltage > 0);
    }

    public void cleanVoltageList() {
        //#4, #13 - ArrayList accessed with for loop
        for (int i = 0; i < possibleVoltages.size(); i++) {
            if (possibleVoltages.get(i) != 5.0 || possibleVoltages.get(i) != 7.0) {
                possibleVoltages.set(i, null);
            }
        }
    }

    public double maxVoltage() {
        //#4, #14 - For loop to find a max or min
        double ans = 0;
        for (double d : possibleVoltages) {
            ans = Math.max(ans, d);
        }
        return ans;
    }

    //This sorts the array with TimSort
    public void SortArrayList() {
        Arrays.sort(possibleVoltages);
    }

}
