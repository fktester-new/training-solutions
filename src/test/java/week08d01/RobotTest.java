package week08d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RobotTest {

   @Test
    public void robotTest(){
        Robot robot = new Robot();
        robot.move("FFFFBBBLLLJJJJ");

        assertEquals(1, robot.getPosition().getX());
        assertEquals(1, robot.getPosition().getY());
    }

    @Test
    public void testWrongMove(){
       Robot robot = new Robot();
       assertThrows(IllegalArgumentException.class, () -> robot.move("FFBBLJJAFFF"));
    }
}
