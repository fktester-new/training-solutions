package week08d05;

import org.junit.jupiter.api.Test;

import java.beans.Expression;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MathAlgorithmsTest {

    @Test
    public void greatestCommonDivisorTest(){
        MathAlgorithms algorithms = new MathAlgorithms();
        assertEquals(30, algorithms.greatestCommonDivisor(30, 60));
        assertEquals(7, algorithms.greatestCommonDivisor(63, 35));
        assertEquals(1, algorithms.greatestCommonDivisor(15, 28));

    }

    @Test
    public void invalidInputTest(){
        MathAlgorithms algorithms2 = new MathAlgorithms();
        assertThrows(IllegalArgumentException.class, () -> algorithms2.greatestCommonDivisor(24, -343));
        // assertThrows(IllegalArgumentException.class, () -> algorithms2.greatestCommonDivisor(12, 24.5));


    }
}
