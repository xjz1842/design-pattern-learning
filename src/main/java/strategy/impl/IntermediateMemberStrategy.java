package strategy.impl;

import strategy.MemberStrategy;

public class IntermediateMemberStrategy implements MemberStrategy{

    @Override
    public double calcPrice(double booksPrice) {
        return booksPrice * 0.9;
    }
}
