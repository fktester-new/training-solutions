package week05d03;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListCounterTest {

    @Test
    public void aCounterTest() {
        ListCounter listCounter = new ListCounter();
        List<String> testList = Arrays.asList("Alma", "körte", "ananász", "kenyér", "Avokádó");

        assertEquals(3, listCounter.aCounter(testList));
    }

    @Test
    public void startsWithEmptyListTest() {
        ListCounter listCounter = new ListCounter();
        List<String> testList = new ArrayList<>();

        assertEquals(0, listCounter.aCounter(testList));
    }
    @Test
    public void startsNoneWithAListTest() {
        ListCounter listCounter = new ListCounter();
        List<String> testList = Arrays.asList("körte", "kenyér", "eper");

        assertEquals(0, listCounter.aCounter(testList));

    }
}