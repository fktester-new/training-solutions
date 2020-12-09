package week07d03;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class NumberListTest {

    @Test
    public void numberListTest(){
        NumberList numbers = new NumberList();
        assertTrue(numbers.isIncreasing(Arrays.asList(1, 3, 5, 7)));
        assertTrue(numbers.isIncreasing(Arrays.asList(-25, 1, 2, 2, 2, 5, 6)));
        assertTrue(numbers.isIncreasing(Arrays.asList(0, 0, 0, 0, 0, 0)));
        assertFalse(numbers.isIncreasing(Arrays.asList(2, 3, -5, 7, 8)));

    }

    @Test
    public void numberListTestOther(){
        NumberList numbers1 = new NumberList();
        assertTrue(numbers1.isIncreasingOther(Arrays.asList(1, 3, 5, 7)));
        assertTrue(numbers1.isIncreasingOther(Arrays.asList(-25, 1, 2, 2, 2, 5, 6)));
        assertTrue(numbers1.isIncreasingOther(Arrays.asList(0, 0, 0, 0, 0, 0)));
        assertFalse(numbers1.isIncreasingOther(Arrays.asList(2, 3, -5, 7, 8)));

    }

    @Test
    public void wrongInputTest(){
        NumberList n1 = new NumberList();
        NumberList n2 = new NumberList();
        Exception iae = assertThrows(IllegalArgumentException.class, () -> n1.isIncreasing(null));
        assertEquals("There must be alt least one number!", iae.getMessage());
        Exception iae1 = assertThrows(IllegalArgumentException.class, () -> n2.isIncreasingOther(Arrays.asList()));
        assertEquals("There must be alt least one number!", iae1.getMessage());
    }

}
