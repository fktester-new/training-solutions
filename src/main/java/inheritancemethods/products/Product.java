package inheritancemethods.products;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Product {

    private static final int DEFAULT_NUMBER_OF_DECIMALS = 2;
    private String name;
    private BigDecimal unitWeight;
    private int numberOfDecimals;

    public Product(String name, BigDecimal unitWeight, int numberOfDecimals) {
        this.name = name;
        this.unitWeight = unitWeight;
        this.numberOfDecimals = numberOfDecimals;
    }

    public Product(String name, BigDecimal unitWeight) {
        this.name = name;
        this.unitWeight = unitWeight;
        this.numberOfDecimals = DEFAULT_NUMBER_OF_DECIMALS;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getUnitWeight() {
        return unitWeight;
    }

    public int getNumberOfDecimals() {
        return numberOfDecimals;
    }

    public BigDecimal totalWeight(int pieces){
        return unitWeight.multiply(new BigDecimal( String.valueOf(pieces))).setScale(numberOfDecimals, RoundingMode.HALF_UP);
    }
}
