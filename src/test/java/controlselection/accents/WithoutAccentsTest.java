package controlselection.accents;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WithoutAccentsTest {
    @Test
    public void testWith() {
        assertEquals('a', new WithoutAccents().convertToCharWithoutAccents('á'));
        assertEquals('E', new WithoutAccents().convertToCharWithoutAccents('É'));
        assertEquals('u', new WithoutAccents().convertToCharWithoutAccents('ű'));
        assertEquals('U', new WithoutAccents().convertToCharWithoutAccents('Ű'));
    }

    @Test
    public void testWithout() {
        assertEquals('a', new WithoutAccents().convertToCharWithoutAccents('a'));
        assertEquals('G', new WithoutAccents().convertToCharWithoutAccents('G'));
        assertEquals('z', new WithoutAccents().convertToCharWithoutAccents('z'));
    }
}
