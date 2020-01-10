package factory.method;

public class WxFactory implements Factory {
    @Override
    public Pay getPayMethod() {
        return new WxPay();
    }
}
