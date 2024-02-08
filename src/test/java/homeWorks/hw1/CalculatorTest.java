package homeWorks.hw1;

import gb.glumov.seminars.seminar1.task1.calk.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;

    @Test
    void calculation() {
    }

    @Test
    void squareRootExtraction() {
    }

    @Test
    void calculatingDiscount() {

        assertThrows(ArithmeticException.class, () -> {
            int finalPrice = 0; // проверка, что происходит исключение ArithmeticException
        });
    }
}