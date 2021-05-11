package week08d01;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SultanTest {

    @Test
    public void testOpenDoors() {
        Sultan sultan = new Sultan();

        List<Integer> openDoors = sultan.openDoors(50);
        List<Integer> moreOpenDoors = sultan.openDoors(100);
        assertEquals("[1, 4, 9, 16, 25, 36, 49]", openDoors.toString());
        assertEquals("[1, 4, 9, 16, 25, 36, 49, 64, 81, 100]", moreOpenDoors.toString());
    }

    @Test
    public void testNonPositiveNumberOfDoors() {
        Sultan sultan = new Sultan();

        assertThrows(IllegalArgumentException.class, () -> sultan.openDoors(0));
        assertThrows(IllegalArgumentException.class, () -> sultan.openDoors(-5));

    }

}