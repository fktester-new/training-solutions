package controlselection.week;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DayOfWeeksTest {

    @Test
    public void testGetTypeOfDay() {
        assertEquals("hét eleje", new DayOfWeeks().getTypeOfDay("hétfő"));
        assertEquals("hét közepe", new DayOfWeeks().getTypeOfDay("szerda"));
        assertEquals("majdnem hétvége", new DayOfWeeks().getTypeOfDay("péntek"));
        assertEquals("hétvége", new DayOfWeeks().getTypeOfDay("vasárnap"));
    }

    @Test
    public void testCase() {
        assertEquals("hét eleje", new DayOfWeeks().getTypeOfDay("HétFő"));
    }

    @Test
    public void testIllegalDay() {
        assertThrows(IllegalArgumentException.class, () -> new DayOfWeeks().getTypeOfDay("abcd"));
    }
}
