package week07d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TruckTest {

    @Test
    public void truckTest(){
        Truck truck = new Truck(6,TransmissionType.MANUAL);

        assertEquals(6, truck.getNumberOfGears());
        assertEquals(TransmissionType.MANUAL, truck.getTransmissionType());
    }
}
