package Lesson_2;

public abstract class Vehicle {

    abstract int testDrive();
    abstract int park();

    public int getNumWheels() {
        return numWheels;
    }

    public int getSpeed() {
        return speed;
    }

    String company;
    String model;
    int yearRelease;
    int numWheels;
    int speed;

}
