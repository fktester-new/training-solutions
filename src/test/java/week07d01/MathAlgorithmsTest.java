package week07d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathAlgorithmsTest {

    @Test
     public void isPrimeTest(){
        assertFalse(MathAlgorithms.isPrime(1));
        assertTrue(MathAlgorithms.isPrime(2));
        assertFalse(MathAlgorithms.isPrime(12));
        assertTrue(MathAlgorithms.isPrime(101));
    }

    @Test
    public void isPrimeOtherWayTest(){
        assertFalse(MathAlgorithms.isPrimeOtherWay(1));
        assertTrue(MathAlgorithms.isPrimeOtherWay(2));
        assertTrue(MathAlgorithms.isPrimeOtherWay(97));

    }

    @Test
    public void wrongInputTest(){
        Exception ex = assertThrows(IllegalArgumentException.class, () -> MathAlgorithms.isPrime(0));
        assertEquals("I need a positive integer!", ex.getMessage());
        Exception ex1 = assertThrows(IllegalArgumentException.class,() -> MathAlgorithms.isPrimeOtherWay(-7) );
        assertEquals("I need a positive integer!", ex1.getMessage());

    }
}

