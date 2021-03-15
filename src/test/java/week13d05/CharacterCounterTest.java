package week13d05;

import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class CharacterCounterTest {

    CharacterCounter cc = new CharacterCounter();

    @Test
    public void testCountNumberOfDifferentCharacters(){
        int count = cc.countNumberOfDifferentCharacters("almapaprika");
        assertEquals(7, count);

        String input = "The quick brown dog jumps over the lazy fox";
        assertEquals(26, cc.countNumberOfDifferentCharacters(input));
    }

    @Test
    public void testCountCharactersInMap(){
        assertEquals(7, cc.countCharactersInMap("almapaprika"));
        String input2 = "The quick brown dog jumps over the lazy fox";
        assertEquals(26, cc.countCharactersInMap(input2));
    }

    @Test
    public void testInvalidInput(){
        assertThrows(IllegalArgumentException.class, () -> cc.countNumberOfDifferentCharacters(null));
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> cc.countNumberOfDifferentCharacters("  \n"));
        assertEquals("The string is empty or null", exception.getMessage());
    }

}