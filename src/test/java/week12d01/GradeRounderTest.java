package week12d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GradeRounderTest {

    @Test
    public void testRoundGrades(){
        int[] grades = new int[]{37, 56, 64, 87, 88};
        int[] result = new int[]{37, 56, 65, 87, 90};
        GradeRounder gr = new GradeRounder();

        assertArrayEquals(result, gr.roundGrades(grades));
    }

    @Test
    public void testRoundGradesOther(){

        int[] grades = new int[]{37, 56, 64, 87, 88};
        int[] result = new int[]{37, 56, 65, 87, 90};
        GradeRounder gr = new GradeRounder();

        assertArrayEquals(result, gr.roundGrades(grades));
    }

    @Test
    public void testEmptyOrNullInput(){
        int[] grades = null;
        int[] grades2 = new int[]{};
        GradeRounder gr = new GradeRounder();

        assertThrows(IllegalArgumentException.class, () -> gr.roundGrades(grades));
        assertThrows(IllegalArgumentException.class, () -> gr.roundGrades(grades2));
    }
}