package factory.simple;

public class WxPay implements Pay {
    @Override
    public void pay() {
        System.out.println("微信付款方式");
    }
}
