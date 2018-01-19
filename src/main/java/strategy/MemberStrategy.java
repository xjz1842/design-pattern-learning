package strategy;


/**
 * 会员优惠价格
 */
public interface MemberStrategy {

    /**
     * 计算图书的价格
     * @param booksPrice 图书的价格
     *@return 图书打折后的价格
     */
    double calcPrice(double booksPrice);

}
