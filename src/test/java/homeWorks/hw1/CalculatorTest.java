package homeWorks.hw1;

import gb.glumov.homeWork.hw1.calculator.Calculator;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;

    @Test
    void calculation() {
        Calculator calculator = new Calculator();

        Assertions.assertThat(Calculator.calculation(5, 6, '+'))
                .isEqualTo(11);

        Assertions.assertThat(Calculator.calculation(6, 5, '-'))
                .isEqualTo(1);

        Assertions.assertThat(Calculator.calculation(5, 6, '*'))
                .isEqualTo(30);

        Assertions.assertThat(Calculator.calculation(100, 50, '/'))
                .isEqualTo(2);

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