package week06d04;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Budget {

    private List<Item> items;

    public Budget(List<Item> items) {

        this.items = items;
    }
    public List<Item> getItemsByMonth(int monthNumber){
        List<Item> result = new ArrayList<>();
        for (Item item: items) {
            if (item.getDate().getMonthValue() == monthNumber) {
                result.add(item);
            }
        }

        return result;
    }

    public List<Item> getItems() {

        return items;
    }
}
