package strategy;

/**
 * 具体付款策略
 */
public class StrategyWeiXin implements Strategy{
    public void pay(){
        System.out.println("微信付款！");
    }
}
