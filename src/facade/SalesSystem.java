package facade;

import singleton.DatabaseConfig;
import strategy.DiscountStrategy;
import strategy.PercentageDiscount;
import strategy.FixedAmountDiscount;


public class SalesSystem {
    private DatabaseConfig databaseConfig;
    private DiscountStrategy discountStrategy;

    public SalesSystem() {
        this.databaseConfig = DatabaseConfig.getInstance();
    }

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public double calculateDiscountedPrice(double originalPrice)
