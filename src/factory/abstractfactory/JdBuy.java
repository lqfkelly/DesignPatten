package factory.abstractfactory;

public class JdBuy implements Buy {
    @Override
    public void buy() {
        System.out.println("京东购物方式");
    }
}
