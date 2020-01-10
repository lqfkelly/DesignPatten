package strategy;

/**
 * 具体付款策略
 */
public class StrategyZFB implements Strategy{
    public void pay(){
        System.out.println("支付宝付款！");
    }
}
