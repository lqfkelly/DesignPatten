package factory.simple;

public class ZFBPay implements Pay {
    @Override
    public void pay() {
        System.out.println("支付宝付款方式");
    }
}
