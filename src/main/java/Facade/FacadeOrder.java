package Facade;

public class FacadeOrder {

    private ProductService productService;
    private PayService payService;

    public FacadeOrder() {
        this.productService = new ProductService();
        this.payService = new PayService();
    }

    public void buyPhone(){
        this.productService.pick();
        this.payService.pay();
    }

}
