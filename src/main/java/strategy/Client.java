package strategy;

import strategy.context.Price;
import strategy.impl.AdvanceMemberStrategy;
import strategy.impl.PrimaryMemberStrategy;

public class Client {

    public static void main(String[] args) {
        Price price = new Price(new PrimaryMemberStrategy());

        //计算价格
        System.out.println("图书的最终价格为："+price.calcPrice(300));

        price = new Price(new AdvanceMemberStrategy());

        //计算价格
        System.out.println("图书的最终价格为："+price.calcPrice(300));
    }
}
