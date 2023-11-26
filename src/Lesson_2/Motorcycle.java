package Lesson_2;

public class Motorcycle extends Vehicle{

    public Motorcycle(String company, String model, int yearRelease){
        this.company = company;
        this.model = model;
        this.yearRelease = yearRelease;
        this.numWheels = 2;
        this.speed = 0;
    }

    @Override
    public int testDrive(){
        if (this.speed == 0) {
            this.speed = 75;
            return this.speed;
        }
        else {
            throw new RuntimeException("Error. Test drive is not possible");
        }
    }

    @Override
    public int park(){
        if (this.speed == 75) {
            this.speed = 0;
            return this.speed;
        }
        else {
            throw new RuntimeException("Error. Parking is impossible");
        }
    }
}
