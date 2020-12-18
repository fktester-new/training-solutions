package week08d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathAlgorithmsTest {

    @Test
    public void greatestCommonDivisorTest(){
        MathAlgorithms algorithms = new MathAlgorithms();
        assertEquals(12, algorithms.greatestCommonDivisor(48, 60));
        assertEquals(7, algorithms.greatestCommonDivisor(63, 35));

    }
}
