package factory.abstractfactory;

public class WxFactory implements Factory {
    @Override
    public Pay payMethod() {
        return new WxPay();
    }
    @Override
    public Buy buyMethod() {
        return new JdBuy();
    }
}
