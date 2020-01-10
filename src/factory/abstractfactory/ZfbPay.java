package factory.abstractfactory;

public class ZfbPay implements Pay {
    @Override
    public void pay() {
        System.out.println("支付宝支付方式");
    }
}
