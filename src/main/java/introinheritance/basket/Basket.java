package introinheritance.basket;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    private List<Item> items = new ArrayList<>();

    public void addItem(Item item){
        items.add(item);
    }

    public void removeItem(String barcode){
        Item toBeRemoved = null;
        for (Item item: items) {
            if (item.getBarcode().equals(barcode)){
                toBeRemoved = item;
            }
        }
        items.remove(toBeRemoved);
    }

    public List<Item> getItems(){
        return new ArrayList<>(items);
    }

    public void clearBasket(){
    items.clear();
    }
}
