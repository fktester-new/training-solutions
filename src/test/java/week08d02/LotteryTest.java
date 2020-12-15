package week08d02;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LotteryTest {

    @Test
    public void testFiveOutOfNinety(){
        List<Integer> result = Arrays.asList(18, 83, 45, 15, 67);
        Lottery lottery = new Lottery();
        assertEquals(result, lottery.getNumbers(90, 5));
    }

    @Test
    public void testSixOutOfFortyFive(){
        List<Integer> result1 = Arrays.asList(18, 38, 45, 15, 22, 36);
        Lottery lottery = new Lottery();
        assertEquals(result1, lottery.getNumbersOneLoop(45, 6));
    }
}
