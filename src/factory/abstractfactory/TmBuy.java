package factory.abstractfactory;

public class TmBuy implements Buy {
    @Override
    public void buy() {
        System.out.println("天猫购物方式");
    }
}
