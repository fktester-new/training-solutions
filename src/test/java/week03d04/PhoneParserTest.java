package week03d04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class PhoneParserTest {

    @Test
    public void phoneParserTest(){

    PhoneParser parser = new PhoneParser();
    Phone phone = parser.parsePhone("30-2345678");

    assertEquals("30", phone.getPrefix());
    assertEquals("2345678", phone.getNumber());
    assertEquals("Phone number: 30-2345678", phone.toString());

    }

}
