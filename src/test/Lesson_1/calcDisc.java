package test.Lesson_1;

import Lesson_1.Calculator;
import org.assertj.core.api.Assertions;
import org.junit.Test;

public class calcDisc {
    @Test
    public void testCalculateDiscountWithValidArguments() {
        Calculator calculator = new Calculator();
        double purchaseAmount = 100.0;
        double discountPercent = 20.0;
        double expectedDiscountedAmount = 80.0;

        double actualDiscountedAmount = calculator.calculateDiscount(purchaseAmount, discountPercent);

        Assertions.assertThat(actualDiscountedAmount).isEqualTo(expectedDiscountedAmount);
    }

    @Test
    public void testCalculateDiscountWithNegativePurchaseAmount() {
        Calculator calculator = new Calculator();
        double purchaseAmount = -100.0;
        double discountPercent = 20.0;

        Assertions.assertThatThrownBy(() -> calculator.calculateDiscount(purchaseAmount, discountPercent))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Invalid arguments");
    }

    @Test
    public void testCalculateDiscountWithNegativeDiscountPercent() {
        Calculator calculator = new Calculator();
        double purchaseAmount = 100.0;
        double discountPercent = -20.0;

        Assertions.assertThatThrownBy(() -> calculator.calculateDiscount(purchaseAmount, discountPercent))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Invalid arguments");
    }
}


