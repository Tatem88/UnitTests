package Lesson_2;

public class Car extends Vehicle{

    public Car(String company, String model, int yearRelease){
        this.company = company;
        this.model = model;
        this.yearRelease = yearRelease;
        this.numWheels = 4;
        this.speed = 0;
    }

    @Override
    public int testDrive(){
        if (this.speed == 0) {
            this.speed = 60;
            return this.speed;
        }
        else {
            throw new RuntimeException("Error. Test drive is not possible");
        }
    }

    @Override
    public int park(){
        if (this.speed == 60) {
            this.speed = 0;
            return this.speed;
        }
        else {
            throw new RuntimeException("Error. Parking is impossible");
        }
    }

    public int getNumWheels() {
        return numWheels;
    }

    public int getSpeed() {
        return speed;
    }

}
