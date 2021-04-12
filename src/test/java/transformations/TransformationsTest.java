package transformations;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TransformationsTest {

    @Test
    void testToNames() {
        List<Trainer> trainers = new ArrayList<>();
        trainers.add(new Trainer("John Doe", 1970));
        trainers.add(new Trainer("Jack Doe", 1980));
        trainers.add(new Trainer("John Smith", 1975));

        List<String> names = new Transformations().toNames(trainers);
        assertEquals(3, names.size());
        assertEquals("John Doe", names.get(0));
        assertEquals("John Smith", names.get(2));
    }

    @Test
    void testToNamesYearOfBirthBefore() {
        List<Trainer> trainers = new ArrayList<>();
        trainers.add(new Trainer("John Doe", 1970));
        trainers.add(new Trainer("Jack Doe", 1980));
        trainers.add(new Trainer("John Smith", 1975));

        List<String> names = new Transformations().toNamesYearOfBirthBefore(trainers, 1975);

        assertEquals(1, names.size());
        assertEquals("John Doe", names.get(0));
    }

}