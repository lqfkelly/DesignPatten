package observer;

public class ConcreteObserver2 implements Observer {
    @Override
    public void update(String msg) {
        System.out.println("观察者2收到了通知："+msg);
    }
}
