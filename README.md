**This is Justin Im's AP Computer Science Spring Final Project**

Here are some examples of implemented code.

```
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
```

Shown is the drive method. Based on a specified amount of ticks, voltage, and speed, it arbitrarily
calculates a speed for each motor.

```
    public void drive (int ticks) {
        // #2, #1 - If statement (+ one with throw exception), Relational Operator
        if (isOn == true) {
            distanceTraveled += ticks * voltage;
        }
        else {
            distanceTraveled += 0;
        }
    }
```
There is another implementation of the same method, but with using the preset voltage and speed.

**Project Summary**
This project was for Ms. Kossiver's AP Computer Science class. The objective of the project was to use
code from the previous semester's final project and implement concepts learned in the spring semester.

https://www.linkedin.com/in/justin-im-9781671ab/

The above is is the LinkedIn profile link required by the project.