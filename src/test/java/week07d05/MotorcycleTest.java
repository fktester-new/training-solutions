package week07d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MotorcycleTest {

    @Test
    public void motorcycleTest(){
        Motorcycle motorcycle = new Motorcycle(5);

        assertEquals(5, motorcycle.getNumberOfGears());
        assertEquals(TransmissionType.SEQUENTIAL,motorcycle.getTransmissionType());
    }
}
