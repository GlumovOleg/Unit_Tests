package homeWorks.hw1;

import gb.glumov.homeWork.hw1.calculator.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void calculation() {
    }

    @Test
    void squareRootExtraction() {
    }

    @Test
    void calculatingDiscount() {
        double finalPrice = 10 * 0.015;
        assertThrows(ArithmeticException.class, () -> {
            finalPrice = 1 / 0;  // проверка, что происходит исключение ArithmeticException
        });
    }
}