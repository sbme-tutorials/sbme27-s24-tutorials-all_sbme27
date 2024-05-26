package observer;

public class Main {
    public static void main(String[] args) {
        NewsAgency observable = new NewsAgency();
        
        NewsChannel observerChannel1 = new NewsChannel("Channel 1");
        observable.addObserver(observerChannel1);
        
        
        NewsChannel observerChannel2 = new NewsChannel("Channel 2");
        observable.addObserver(observerChannel2);

        NewsChannel observerChannel3 = new NewsChannel("Channel 3");
        observable.addObserver(observerChannel3);
        
        
        observable.setNews("new accident");
    }
}
