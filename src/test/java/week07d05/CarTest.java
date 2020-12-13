package week07d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTest {

    @Test
    public void carTest(){
        Car car = new Car(6);

        assertEquals(6, car.getNumberOfGears());
        assertEquals(TransmissionType.AUTOMATIC, car.getTransmissionType());
    }
}
