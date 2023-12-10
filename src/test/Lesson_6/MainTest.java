package test.Lesson_6;

import Lesson_6.Main;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
public class MainTest {
    @Test
    public void testReadNumbers() {
        String input = "1 2 3";
        List<Integer> expectedNumbers = new ArrayList<>();
        expectedNumbers.add(1);
        expectedNumbers.add(2);
        expectedNumbers.add(3);

        List<Integer> actualNumbers = Main.readNumbers(input);

        Assert.assertEquals(expectedNumbers, actualNumbers);
    }

    @Test
    public void testCalculateAverage() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        double expectedAverage = 2.0;
        double actualAverage = Main.calculateAverage(numbers);

        Assert.assertEquals(expectedAverage, actualAverage, 0.01);
    }
}
