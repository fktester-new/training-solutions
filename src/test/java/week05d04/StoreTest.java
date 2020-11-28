package week05d04;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class StoreTest {

    @Test
    public void addProductTest(){
        List <Product> testList = new ArrayList<>();
        Store store = new Store(testList);
        assertFalse(store.addProduct(new Product("milk", 2020, 11, 25)));
        assertTrue(store.addProduct(new Product("milk", 2020, 11, 30)));
        assertFalse(store.addProduct(new Product("milk", 2020, 12, 25)));
    }

    @Test
    public void getNumberOfExpiredTest(){
        List<Product> testList = new ArrayList<>();
        testList.add(new Product("milk", 2020, 11,01));
        testList.add(new Product("butter", 2020, 12, 31));
        testList.add(new Product("beer", 2020, 11,20));
        Store store = new Store(testList);

        assertEquals(2, store.getNumberOfExpired());
        assertEquals(false, store.addProduct(new Product("milk", 2020, 11, 30)));
    }

}
