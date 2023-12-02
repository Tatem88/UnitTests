package test.Lesson_3;

import org.junit.Assert;
import org.junit.Test;

public class TestEvenOddNumber {
    private boolean evenOddNumber(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    @Test
    public void testEvenNumber() {
        int n = 10;
        boolean result = evenOddNumber(n);
        Assert.assertTrue(result);
    }



    @Test
    public void testOddNumber() {
        int n = 5;
        boolean result = evenOddNumber(n);
        Assert.assertFalse(result);
    }

    @Test
    public void testZero() {
        int n = 0;
        boolean result = evenOddNumber(n);
        Assert.assertTrue(result);
    }

    @Test
    public void testNegativeEvenNumber() {
        int n = -4;
        boolean result = evenOddNumber(n);
        Assert.assertTrue(result);
    }

    @Test
    public void testNegativeOddNumber() {
        int n = -9;
        boolean result = evenOddNumber(n);
        Assert.assertFalse(result);
    }
}
