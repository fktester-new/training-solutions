package inheritanceattributes.book;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShippedBookTest {

    @Test
    public void constructorTest(){

    ShippedBook shippedBook = new ShippedBook("Gyűrűk ura", 3000, 1000);

    assertEquals("Gyűrűk ura", shippedBook.getTitle());
    assertEquals(3000, shippedBook.price);
    assertEquals(1000, shippedBook.getShippingCost());
    }

    @Test
    public void orderTest(){

        ShippedBook shippedBook = new ShippedBook("Gyűrűk ura", 3000, 1000);

        assertEquals(10000, shippedBook.order(3));
    }

    @Test
    public void toStringTest(){

        ShippedBook shippedBook = new ShippedBook("Gyűrűk ura", 3000, 1000);

        assertEquals("Book data: Title: Gyűrűk ura, Price: 3000, Shipping cost: 1000", shippedBook.toString());

    }
}
