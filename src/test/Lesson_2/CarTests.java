package test.Lesson_2;

import Lesson_2.Car;
import Lesson_2.Vehicle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CarTests {
    private static Car car;

    @BeforeEach
    void beforeEach() {
        car = new Car("Mercedes", "Maybach S-Class", 2023);
    }



    @Test
    void testIfCarIsVehicle(){
        assertTrue(car instanceof Vehicle);
    }



    @Test
    public void howManyWHeelsInCar(){
        assertEquals(4, car.getNumWheels());
    }


    @Test
    void testDrive() {
        assertEquals(60, car.testDrive());
    }

    @Test
    void park() {
        car.testDrive();
        assertEquals(0, car.park());
    }

}
