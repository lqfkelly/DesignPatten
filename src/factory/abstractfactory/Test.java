package factory.abstractfactory;

public class Test {
    public static void main(String[] args) {
        Pay pay = new ZfbFactory().payMethod();
        pay.pay();
        pay = new WxFactory().payMethod();
        pay.pay();

        Buy buy = new ZfbFactory().buyMethod();
        buy.buy();
        buy = new WxFactory().buyMethod();
        buy.buy();
    }
}
