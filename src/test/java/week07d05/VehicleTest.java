package week07d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VehicleTest {

    @Test
    public void twoParamVehicleTest(){
        Vehicle vehicle = new Vehicle(6,TransmissionType.AUTOMATIC);

        assertEquals(6, vehicle.getNumberOfGears());
        assertEquals(TransmissionType.AUTOMATIC, vehicle.getTransmissionType());
    }

    @Test
    public void oneParamVehicleTest(){
        Vehicle vehicle1 = new Vehicle(TransmissionType.MANUAL);

        assertEquals(5, vehicle1.getNumberOfGears());
        assertEquals(TransmissionType.MANUAL, vehicle1.getTransmissionType());

    }

    @Test
    public void noParamVehicleTest(){
        Vehicle vehicle2 = new Vehicle();

        assertEquals(5, vehicle2.getNumberOfGears());
        assertEquals(TransmissionType.MANUAL, vehicle2.getTransmissionType());
    }
}
