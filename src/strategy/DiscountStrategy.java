package strategy;

import strategy.PercentageDiscount;
import strategy.FixedAmountDiscount;

public interface DiscountStrategy {
    double applyDiscount(double originalPrice);
}

// Exemplo de implementação de estratégia
public class PercentageDiscount implements DiscountStrategy {
    private double percentage;

    public PercentageDiscount(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public double applyDiscount(double originalPrice) {
        return originalPrice - (originalPrice * percentage / 100.0);
    }
}
