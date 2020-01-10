package factory.abstractfactory;

public class ZfbFactory implements Factory {
    @Override
    public Pay payMethod() {
        return new ZfbPay();
    }
    @Override
    public Buy buyMethod() {
        return new TmBuy();
    }
}
