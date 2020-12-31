package week09d03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class PersonTest {

    @Test
    public void testOverFourteen(){
        Person p = new Person("John Doe", 16);
        p.setPresent();

        assertNotEquals(null, p.getPresent());
        assertNotEquals(Present.TOY, p.getPresent());
    }

    @Test
    public void testUnderFourteen(){
        Person p = new Person("Jane Doe", 12);
        p.setPresent();

        assertNotEquals(null, p.getPresent());
    }
}
