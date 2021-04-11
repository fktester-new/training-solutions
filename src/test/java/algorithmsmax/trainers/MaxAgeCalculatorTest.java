package algorithmsmax.trainers;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MaxAgeCalculatorTest {

    @Test
    public void maxAgeCalculatorTest(){
        List<Trainer> trainers = new ArrayList<>();
        trainers.add(new Trainer("John Doe", 32));
        trainers.add(new Trainer("Jane Doe", 26));
        trainers.add(new Trainer("Jack Doe", 35));
        trainers.add(new Trainer("John Smith", 34));

        MaxAgeCalculator maxAgeCalculator = new MaxAgeCalculator();

        assertEquals("Jack Doe", maxAgeCalculator.trainerWithMaxAge(trainers).getName());
        assertEquals(35, maxAgeCalculator.trainerWithMaxAge(trainers).getAge());
    }

}