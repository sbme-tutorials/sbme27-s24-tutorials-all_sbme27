package isp;
// Corrected implementation following ISP
interface Workable {
    void work();
}

interface Eatable {
    void eat();
}

interface Sleepable {
    void sleep();
}

class Human implements Workable, Eatable, Sleepable {
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

class Robot implements Workable {
    @Override
    public void work() {
        // Logic for working
    }
}

public class ISP {
    
}
