package week10d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

    @Test
    public void testFindMinSum(){
        int[] arr = {10, 2, 21, 9, 7, 5, 8, 3, -5, 12};
        Calculator c = new Calculator();
        assertEquals(5, c.findMinSum(arr));
    }

    @Test
    public void testShortInput(){
        int[] arr1 = {2, 6, 8};
        int[] arr2 = null;
        Calculator c = new Calculator();

        assertThrows(IllegalArgumentException.class, () -> c.findMinSum(arr1));
        assertThrows(IllegalArgumentException.class, () -> c.findMinSum(arr2));
    }

    @Test
    public void testFindMinSumWithoutSort(){
        int[] arr = {10, 2, 21, 9, 7, 5, 8, 3, -5, 12};
        Calculator c = new Calculator();
        assertEquals(5, c.findMinSumWithoutSort(arr));
    }
}
