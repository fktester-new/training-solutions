package arraysexercises.vowelcount;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class VowelsTest {

    @Test
    void vowelCount() {
        int[] r = new int[]{1, 3, 3, 1, 0};

        assertTrue(Arrays.equals(r, Vowels.vowelCount("i think, therefore i am")) );
        // elapsed time: 47 ms
    }

    @Test
    void vowelCountOtherTest(){
        int[] r = new int[]{1, 3, 3, 1, 0};

        assertTrue(Arrays.equals(r, Vowels.vowelCountOther("i think, therefore i am")) );
        // elapsed time: 63 ms
    }
}