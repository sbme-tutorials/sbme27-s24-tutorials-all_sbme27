package singelton;

public class Singleton {
    // Step 2: Static member variable to hold the single instance
    private static Singleton instance;

    // Step 1: Private constructor to prevent instantiation from outside
    private Singleton() {
    }

    // Step 3: Static method to provide global access point
    public static Singleton getInstance() {
        // Step 4: Lazy initialization
        if (instance == null) {
            // Step 5: Thread safety using double-checked locking
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}

