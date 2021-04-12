package filtering;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TrainerFilterTest {

    @Test
    void testFilterByName(){
        List<Trainer> trainers = new ArrayList<>();
        trainers.add(new Trainer("John Doe", 1970));
        trainers.add(new Trainer("Jack Doe", 1980));
        trainers.add(new Trainer("John Smith", 1975));

        List<Trainer> filteredTrainers = new TrainerFilter().filterByName(trainers, "John");

        assertEquals(2, filteredTrainers.size());
        assertEquals("John Doe", filteredTrainers.get(0).getName());
        assertEquals("John Smith", filteredTrainers.get(1).getName());
    }

}