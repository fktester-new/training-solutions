package week10d01;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class HikingTest {

    @Test
    public void testGetPlusElevation(){

        Hiking hiking = new Hiking();
        List<Double> list1 = Arrays.asList(10.5,20.5,15.3,18.9);
        assertTrue(Math.abs(13.60 - hiking.getPlusElevation(list1)) < 0.0001);
    }

    @Test
    public void testEmptyList(){
        Hiking hiking = new Hiking();
        List<Double> list1 = Arrays.asList();
        List<Double> list2 = null;

        Exception ex = assertThrows(IllegalArgumentException.class, () -> hiking.getPlusElevation(list1));
        assertEquals("The list of heights must not be empty or null!", ex.getMessage() );
        Exception ex2 = assertThrows(IllegalArgumentException.class, () -> hiking.getPlusElevation(list2));
        assertEquals("The list of heights must not be empty or null!", ex2.getMessage());

    }
}
