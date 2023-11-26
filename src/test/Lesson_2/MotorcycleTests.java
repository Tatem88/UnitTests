package test.Lesson_2;

import Lesson_2.Motorcycle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MotorcycleTests {

    private static Motorcycle motorcycle;

    @BeforeEach
    void beforeEach(){
        motorcycle = new Motorcycle("Mercedes", "MV Agusta F3 800 AMG", 2016);
    }

    @Test
    void howManyWheelsInMoto(){
        assertEquals(2, motorcycle.getNumWheels());
    }

    @Test
    void testDrive() {
        assertEquals(75, motorcycle.testDrive());
    }


    @Test
    void park() {
        motorcycle.testDrive();
        assertEquals(0, motorcycle.park());
    }
}
