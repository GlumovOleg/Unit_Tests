package gb.glumov.homeWork.hw3;

import junit.framework.AssertionFailedError;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static gb.glumov.homeWork.hw3.GeneratorNumber.evenOddNumber;
import static org.junit.jupiter.api.Assertions.*;

class GeneratorNumberTest {

    @Test
    public void evenOddNumberCheckNumber() {
        assertTrue(evenOddNumber(4));
        assertFalse(evenOddNumber(3));
        assertTrue(evenOddNumber(7));

    }

    @Test
    void numberInIntervalCheckNumber() {
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        assertTrue(randomNumber >= 25 && randomNumber <= 100);
        
        if ((randomNumber < 25 && randomNumber > 100)) {
            throw new AssertionFailedError("Число не попадает в интервал");
        }

    }
}