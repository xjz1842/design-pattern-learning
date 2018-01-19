package strategy.context;

import strategy.MemberStrategy;

public class Price {

    //持有一个具体的策略对象
    private MemberStrategy strategy;

    public Price(MemberStrategy strategy) {
        this.strategy = strategy;
    }

    public double calcPrice(double booksPrice) {
      return this.strategy.calcPrice(booksPrice);
    }
}