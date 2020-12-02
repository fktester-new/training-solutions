package week06d03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordEraserTest {

    @Test
     public void eraseWordTest(){
        WordEraser worderaser = new WordEraser();
        String original = "alma körte barack szilva birsalma almapaprika alma paprika";
        String result = "körte barack szilva birsalma almapaprika paprika";
        assertEquals(result, worderaser.eraseWord(original, "alma"));
    }

    @Test
     public void eraseWordWithScannerTest(){
        WordEraser worderaser = new WordEraser();
        String original = "alma körte barack szilva birsalma almapaprika alma paprika";
        String result = "körte barack szilva birsalma almapaprika paprika";
        assertEquals(result, worderaser.eraseWordWithScanner(original, "alma"));
    }

}
