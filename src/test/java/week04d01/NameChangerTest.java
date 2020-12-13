package week04d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NameChangerTest {

    @Test
    public void nameChangerTest(){
        NameChanger nameChanger = new NameChanger("Doe John");

        nameChanger.changeFirstName("Jack");
        assertEquals("Doe Jack", nameChanger.getFullName());
    }

    @Test
    public void wrongFirstNameTest(){

        Exception iae = assertThrows(IllegalArgumentException.class, () -> new NameChanger(" "));
        assertEquals("Invalid name: ", iae.getMessage());

        Exception iae1 = assertThrows(IllegalArgumentException.class, () -> new NameChanger(null));
        assertEquals("Invalid name:null", iae1.getMessage());

    }
}
