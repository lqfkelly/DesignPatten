package observer;

public class ConcreteObserver1 implements Observer {
    @Override
    public void update(String msg) {
        System.out.println("观察者1收到了通知："+msg);
    }
}
