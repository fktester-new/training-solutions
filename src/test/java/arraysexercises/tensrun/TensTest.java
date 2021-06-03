package arraysexercises.tensrun;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TensTest {

    @Test
    void runTensTest() {
        Tens tens = new Tens();
        int[] nums = {10, 1, 9, 20};
        int[] expected = {10, 10, 10, 20};
        int[] nums2 = {2, 10, 3, 4, 20, 5};
        int[] expected2 = {2, 10, 10, 10, 20, 20};

        assertArrayEquals(expected, tens.tenRun(nums));
        assertArrayEquals(expected2, tens.tenRun(nums2));
    }
}
