package week06d01;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ListSelectorTest {

   ListSelector ls = new ListSelector();

    @Test
    public void getEvenIndexPartsTest(){

        assertEquals("[alma, dió]", ls.getEvenIndexParts(Arrays.asList("alma", "körte", "dió", "barack")));
    }

    @Test
    public void getEvenIndexPartsWithNull(){
        assertThrows(IllegalArgumentException.class, () -> ls.getEvenIndexParts(null));
    }

    @Test
    public void getEvenIndexPartsWithEmptyList() {
        assertEquals("", ls.getEvenIndexParts(new ArrayList<>()));
    }
}
