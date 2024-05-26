package observer;

// Step 5: Client Code
public class ObserverPatternExample {
    public static void main(String[] args) {
        System.out.println("");
        Observable1Impl observable = new Observable1Impl();
        Observer observer1 = new Observer1Impl("Observer 1");
        Observer observer2 = new Observer1Impl("Observer 2");

        observable.attach(observer1);
        observable.attach(observer2);

        observable.setState(5); // Notifies both observers
        observable.detach(observer1);

        observable.setState(10); // Notifies only observer2
    }
}