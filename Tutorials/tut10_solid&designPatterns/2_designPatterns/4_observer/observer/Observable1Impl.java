package observer;

import java.util.ArrayList;
import java.util.List;

// Step 2: Concrete Subject
class Observable1Impl implements Observable {
    private int state;
    private List<Observer> observers = new ArrayList<>();

    public void setState(int state) {
        this.state = state;
        notifyObservers();
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(state);
        }
    }
}