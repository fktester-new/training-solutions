package week06d04;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BudgetTest {

    private Budget budget = new Budget(Arrays.asList(
            new Item(500, 2020, 12, 20, "Apple"),
            new Item(700, 2020, 12, 27, "Pear"),
            new Item(450, 2021, 01, 02, "Toast"),
            new Item(650, 2021, 02, 27, "Butter"),
            new Item(450, 2021, 02, 28, "Flour")
    ));

    @Test
    public void getItemsByMonthTest(){
        List<Item> result = budget.getItemsByMonth(12);
        List<Item> result1 = budget.getItemsByMonth(01);
        List<Item> result2 = budget.getItemsByMonth(02);

        assertEquals(2, result.size());
        assertEquals(1, result1.size());
        assertEquals("Flour", result2.get(1).getName());
    }
}


