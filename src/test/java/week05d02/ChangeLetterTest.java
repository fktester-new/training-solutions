package week05d02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChangeLetterTest {

    @Test
    public void changeVowelsTest(){
        ChangeLetter changeLetter = new ChangeLetter();
        assertEquals("l*st*n*ng", changeLetter.changeVowels("listening"));
    }

    @Test
    public void onlyConsonantsTest() {
        ChangeLetter changeLetter = new ChangeLetter();
        assertEquals("sdfgh", changeLetter.changeVowels("sdfgh"));
    }

    @Test
    public void changeVowelsCaseSensitiveTest(){
        ChangeLetter changeLetter = new ChangeLetter();
        assertEquals("*ll*g*l*rg*m*nt*xc*pt**n", changeLetter.changeVowelsCaseSensitive("IllegalArgumentException"));
    }

}
