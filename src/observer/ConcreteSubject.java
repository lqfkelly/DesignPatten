package observer;

public class ConcreteSubject extends Subject {
    @Override
    public void notifyAll(String msg) {
        for(Observer observer : observers){
            observer.update(msg);
        }
    }
}
