package factory.method;

public class ZfbFactory implements Factory {
    @Override
    public Pay getPayMethod() {
        return new ZFBPay();
    }
}
