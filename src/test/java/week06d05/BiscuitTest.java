package week06d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static week06d05.Biscuit.of;
import static week06d05.BiscuitType.OREO;
import static week06d05.BiscuitType.PILOTA;

public class BiscuitTest {

    @Test
    public void ofTest() {
        Biscuit biscuit = of(OREO, 30);
        assertEquals("Biscuit{type= OREO, gramAmount= 30}", biscuit.toString());
    }

    @Test
    public void nullTypeTest() {
        assertThrows(IllegalArgumentException.class, () -> {
            Biscuit.of(null, 15).toString();
        });
    }

    @Test
    public void wrongGramAmountTest() {
        assertThrows(IllegalArgumentException.class, () -> {
            Biscuit.of(PILOTA, -30).toString();
        });
    }
}