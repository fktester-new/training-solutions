package week11d03;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class WordFilterTest {

    @Test
    public void testWordsWithChar(){
        WordFilter wordFilter = new WordFilter();
        List<String> words = Arrays.asList("alma", "körte", "narancs", "barack", "banán");
        List<String> result = List.of("körte", "narancs", "barack");

        assertEquals(result, wordFilter.wordsWithChar(words, 'r'));
    }

    @Test
    public void testEmptyOrNullInput(){
        WordFilter wordFilter = new WordFilter();
        List<String> words = null;
        List<String> words2 = List.of();

        assertThrows(IllegalArgumentException.class, () -> wordFilter.wordsWithChar(words, 'r'));
        assertThrows(IllegalArgumentException.class, () -> wordFilter.wordsWithChar(words2, 'a'));
    }
}
