package strategy;

/**
 *
 */
public class Context {
    Strategy stg;
    public Context(Strategy stg){
        this.stg = stg;
    }
    public void pay(){
        stg.pay();
    }
    public static void main(String[] args) {
        Context context1 = new Context(new StrategyWeiXin());
        context1.pay();

        Context context2 = new Context(new StrategyZFB());
        context2.pay();
    }
}
