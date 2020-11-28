package week05d05;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {
    @Test
    public void userTest(){
        User user = new User("Kovács", "Ferenc", "kofe16@gmail.com");
        assertEquals("Kovács Ferenc, kofe16@gmail.com", user.getFullName() + ", " + user.getEmail());
    }

    @Test
    public void emailWithoutAtTest() throws IllegalArgumentException {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new User("Kovács", "Ferenc", "kofe16.gmail.com");
        });
    }

    @Test
    public void emailWithoutDot() throws IllegalArgumentException {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new User("Kovács", "Ferenc", "kofe16@gmailcom");
        });
    }

}
