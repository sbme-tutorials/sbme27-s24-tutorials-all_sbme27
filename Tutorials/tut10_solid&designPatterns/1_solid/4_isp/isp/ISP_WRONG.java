package isp;
// Wrong implementation violating ISP
interface Worker {
    void work();
    void eat();
    void sleep();
}

class Human implements Worker {
    @Override
    public void work() {
        // Logic for working
    }

    @Override
    public void eat() {
        // Logic for eating
    }

    @Override
    public void sleep() {
        // Logic for sleeping
    }
}

class Robot implements Worker {
    @Override
    public void work() {
        // Logic for working
    }

    @Override
    public void eat() {
        // No logic for eating, robots don't eat
        throw new AssertionError("robots don't eat!");
    }

    @Override
    public void sleep() {
        // No logic for sleeping, robots don't sleep
        throw new AssertionError("robots don't sleep!");
    }
}


public class ISP_WRONG {
    
}
