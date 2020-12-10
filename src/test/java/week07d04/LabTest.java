package week07d04;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class LabTest {

    @Test
    public void createWithTitle(){
        Lab lab = new Lab("Task1");

        assertEquals("Task1", lab.getTitle());
        assertFalse(lab.isCompleted());
    }

    @Test
    public void createWithTitleAndDateTest(){
        Lab lab = new Lab("Task1", LocalDateTime.of(2020,12,10,15,51,0));

        assertEquals("Task1", lab.getTitle());
        assertTrue(lab.isCompleted());
        assertEquals(LocalDateTime.of(2020,12,10,15,51,0), lab.getCompletedAt());
    }

    @Test
    public void completedNowTest(){
        Lab lab = new Lab("Task1");
        lab.complete();

        assertTrue(lab.isCompleted());
        assertTrue(lab.getCompletedAt().plusSeconds(1).isAfter(LocalDateTime.now()));
        assertTrue(lab.getCompletedAt().minusSeconds(1).isBefore(LocalDateTime.now()));

    }

    @Test
    public void completedAtTest(){
        LocalDateTime finished = LocalDateTime.of(2020,12,10,17,50,0);
        Lab lab = new Lab("Task2");
        lab.complete(finished);

        assertTrue(lab.isCompleted());
        assertEquals(LocalDateTime.of(2020,12,10,17,50,0 ), lab.getCompletedAt());


    }
}
