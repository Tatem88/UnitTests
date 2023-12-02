package test.Lesson_3;

import Lesson_3.NumberUtils;
import org.junit.Assert;
import org.junit.Test;

public class NumberUtilsTest {

    @Test
    public void testNumberInInterval_ShouldReturnTrue_WhenNumberIsInInterval() {
        NumberUtils numberUtils = new NumberUtils();
        boolean result = numberUtils.numberInInterval(50);
        Assert.assertTrue(result);
    }

    @Test
    public void testNumberInInterval_ShouldReturnFalse_WhenNumberIsNotInInterval() {
        NumberUtils numberUtils = new NumberUtils();
        boolean result = numberUtils.numberInInterval(10);
        Assert.assertFalse(result);
    }

    @Test
    public void testNumberInInterval_ShouldReturnFalse_WhenNumberIsLowerBound() {
        NumberUtils numberUtils = new NumberUtils();
        boolean result = numberUtils.numberInInterval(25);
        Assert.assertTrue(result);
    }

    @Test
    public void testNumberInInterval_ShouldReturnFalse_WhenNumberIsUpperBound() {
        NumberUtils numberUtils = new NumberUtils();
        boolean result = numberUtils.numberInInterval(100);
        Assert.assertTrue(result);
    }

}
