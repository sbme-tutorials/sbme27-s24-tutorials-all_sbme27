package observer;

// Step 1: Subject Interface
interface Observable {
    void attach(Observer observer); // subscribe
    void detach(Observer observer); // unsubscribe
    void notifyObservers(); // notify
}