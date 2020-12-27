package introinheritance.basket;

public class ShoppingBasket {

    private Basket basket = new Basket();

    public void addItem(Item item){
        basket.addItem(item);
    }

    public void removeItem(String barcode){
        basket.removeItem(barcode);
    }

    public double sumNettoPrice(){
        double sumNetto = 0.0;
        for (Item item:basket.getItems()) {
            sumNetto += item.getNettoPrice();
        }
        return sumNetto;
    }

    public double sumTaxValue(){
        double sumVat = 0.0;
        for (Item item:basket.getItems()) {
            sumVat += item.getTaxAmount();
        }
        return sumVat;
    }

    public double sumBruttoPrice(){
        return sumNettoPrice() + sumTaxValue();
    }

    public void checkout(){
        basket.clearBasket();
    }

    public void removeMostExpensiveItem(){
        removeItem(findMostExpensiveItemBarCode());
    }

    private String findMostExpensiveItemBarCode(){
        Item max = basket.getItems().get(0);
        for (Item item: basket.getItems()) {
            if(max.getNettoPrice() < item.getNettoPrice()){
                max = item;
            }
        }
        return max.getBarcode();
    }

}
