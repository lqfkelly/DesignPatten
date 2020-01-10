package observer;

import java.util.ArrayList;
import java.util.List;

abstract class Subject {
    List<Observer> observers = new ArrayList<Observer>();
    public void addObserver(Observer observer){
        observers.add(observer);
    }
    public void deleteObserver(Observer observer){
        observers.remove(observer);
    }
    public abstract void notifyAll(String msg);
}
