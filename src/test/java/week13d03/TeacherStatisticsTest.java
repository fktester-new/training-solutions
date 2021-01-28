package week13d03;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TeacherStatisticsTest {

    TeacherStatistics ts = new TeacherStatistics();


    @Test
    public void readFromFileTest(){
        ts.readFromFile("src/main/java/week13d03/beosztas.txt");
        assertEquals(329, ts.getData().size());
    }

    @Test
    public void testWeeklyWork(){
        ts.readFromFile("src/main/java/week13d03/beosztas.txt");
        assertEquals(22, ts.weeklyWork("Csincsilla Csilla"));

    }

    @Test
    public void testSumLessonsOfTeacherFromFile(){
        assertEquals(22, ts.sumLessonsOfTeacherFromFile("src/main/java/week13d03/beosztas.txt","Csincsilla Csilla"));
        }
}
