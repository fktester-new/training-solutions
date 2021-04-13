package software;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeveloperSoftwareTest {

    @Test
    void testDeveloperSoftware() {

        Software software = new DeveloperSoftware("Win 10 Prof", 80_000);
        DeveloperSoftware developer = new DeveloperSoftware("Ms Office 2019 Prof", 90_000);

        assertEquals("Win 10 Prof", software.getName());
        assertEquals(88_000, software.getPrice());

        assertEquals("Ms Office 2019 Prof", developer.getName());
        assertEquals(99_000, developer.getPrice());

    }
}
