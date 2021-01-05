package week10d02;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MaxTravelTest {

    @Test
    public void testMaxTravel(){
        List<Integer> passengers = List.of(12,12,0,3,4,4,12);

        assertEquals(12, new MaxTravel().getMaxIndex(passengers));
    }

    @Test
    public void testWrongInputList(){
        List<Integer> passengers = null;
        List<Integer> passengers2 = List.of();

        assertThrows(IllegalArgumentException.class, () -> new MaxTravel().getMaxIndex(passengers));
        assertThrows(IllegalArgumentException.class, () -> new MaxTravel().getMaxIndex(passengers2));

    }
}