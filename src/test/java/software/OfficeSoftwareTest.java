package software;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OfficeSoftwareTest {

    @Test
    void testOfficeSoftware(){
        OfficeSoftware office = new OfficeSoftware("Win10 Home", 50_000);
        Software office2 = new OfficeSoftware("Ms Office 2019 Home", 52_000);

        assertEquals(52500, office.getPrice());
        assertEquals("Win10 Home", office.getName());
        assertEquals(54600, office2.getPrice());
        assertEquals("Ms Office 2019 Home", office2.getName());
    }

}