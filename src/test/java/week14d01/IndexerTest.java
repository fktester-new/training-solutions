package week14d01;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class IndexerTest {

    @Test
    public void testIndexer(){
        Map<Character, List<String>> calculated = new Indexer().index(Arrays.asList("Odon", "Lujza", "Abraham", "Magdolna", "Lajos"));
        // Sorting by key the map
        List<Character> calculatedByKey = new ArrayList<>(calculated.keySet());
        Collections.sort(calculatedByKey);

        Map<Character, List<String>>  expected = Map.of('A', Arrays.asList("Abraham"), 'L', Arrays.asList("Lujza", "Lajos"), 'M', Arrays.asList("Magdolna"), 'O', Arrays.asList("Odon"));
        assertEquals(expected, calculated);
    }

}