package week06d02;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StoreTest {

    @Test
    public void getProductByCategoryNameTest() {
        Store store = new Store(Arrays.asList(
                new Product("Kenyér", Category.BAKED_GOODS, 400),
                new Product("Zsemle", Category.BAKED_GOODS, 20),
                new Product("Kifli", Category.BAKED_GOODS, 20),
                new Product("Tej", Category.DAIRY, 195),
                new Product("Kefír", Category.DAIRY, 70),
                new Product("Lazac", Category.FROZEN, 4250)
        ));

        assertEquals(2, store.getProductByCategoryName(Category.DAIRY));
        assertEquals(1, store.getProductByCategoryName(Category.FROZEN));
        assertEquals(0, store.getProductByCategoryName(Category.OTHER));
    }
}
