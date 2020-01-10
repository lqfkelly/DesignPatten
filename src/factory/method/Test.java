package factory.method;

/**
 *    //静态工厂方法
 *    //工厂方法具体工厂中的方法改成static即可
 *    //不用new即可得到想要的具体方式
 *    //新增一种方式时需要增加一个方式类及对应的工厂类，如果过多的话代码量大，复用可能性小
 */
public class Test {
    public static void main(String[] args) {
        Pay pay = new ZfbFactory().getPayMethod();
        pay.pay();
        pay = new WxFactory().getPayMethod();
        pay.pay();
    }
}
