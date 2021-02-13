package week14d02;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BasketTest {

    Basket basket = new Basket();
    Map<String, List<String>> products = new HashMap<>();


    @Test
    public void testReadFileToMap() {
        basket.readFileToMap("shopping_list.txt");
        assertEquals(9, basket.getProducts().keySet().size());
    }

    @Test
    public void testListBasket(){
        basket.readFileToMap("shopping_list.txt");
        assertEquals("[basil, cheese, passata, pasta]",basket.listBasket("B341").toString());
        }

    @Test
    public void testCountProduct(){
        basket.readFileToMap("shopping_list.txt");
        assertEquals(2, basket.countProduct("beer"));
    }

    @Test
    public void testGetNumberOfGoods(){
        basket.readFileToMap("shopping_list.txt");
        assertEquals(8, basket.getNumberOfGoods("W34111"));
    }

    @Test
    public void testStat(){
        basket.readFileToMap("shopping_list.txt");
        assertEquals(2, basket.stat().get("tomato"));
    }

    @Test
    public void testSortedStat(){
        basket.readFileToMap("shopping_list.txt");
        assertEquals("apple", basket.sortedStat().keySet().toArray()[0]);
    }
}