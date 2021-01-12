package week11d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DivisorFinderTest {

    @Test
    public void testFindDivisors(){
        int m = 4255;
        int n = 111;
        DivisorFinder d = new DivisorFinder();

        assertEquals(2, d.findDivisors(m));
        assertEquals(3, d.findDivisors(n));
    }

    @Test
    public void testZeroDigitInput(){
        int n = 320;
        DivisorFinder d = new DivisorFinder();
        assertThrows(ArithmeticException.class, () -> d.findDivisors(n));
    }
}
