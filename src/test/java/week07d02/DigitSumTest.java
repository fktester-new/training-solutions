package week07d02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DigitSumTest {

    @Test
    public void sumOfDigitsTest(){
        assertEquals(6, DigitSum.sumOfDigits(312));
        assertEquals(21, DigitSum.sumOfDigits(312456));
    }

    @Test
    public void sumOfDigitsOtherTest(){
        assertEquals(6, DigitSum.sumOfDigitsOther(501));
        assertEquals(36, DigitSum.sumOfDigitsOther(9999));
    }

    @Test
    public void negativeInputTest(){
        Exception iae = assertThrows(IllegalArgumentException.class, () -> DigitSum.sumOfDigits(-10));
        assertEquals("I need a positive integer!", iae.getMessage());
        Exception iae2 = assertThrows(IllegalArgumentException.class, () -> DigitSum.sumOfDigitsOther(0));
        assertEquals("I need a positive integer!", iae2.getMessage());

    }
}


