package controlselection.consonant;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ToConsonantTest {

    @Test
    public void testVowel() {
        assertEquals('b', new ToConsonant().convertToConsonant('a'));
        assertEquals('F', new ToConsonant().convertToConsonant('E'));
        assertEquals('j', new ToConsonant().convertToConsonant('i'));
    }

    @Test
    public void testConsonant() {
        assertEquals('b', new ToConsonant().convertToConsonant('b'));
        assertEquals('g', new ToConsonant().convertToConsonant('g'));
        assertEquals('Z', new ToConsonant().convertToConsonant('Z'));
    }
}
