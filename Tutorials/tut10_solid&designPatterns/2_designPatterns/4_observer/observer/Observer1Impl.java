package observer;

// Step 4: Concrete Observers
class Observer1Impl implements Observer {
    private String name;

    Observer1Impl(String name){
        this.name = name;
    }

    @Override
    public void update(int state) {
        System.out.println("Observer " + name + " updated with state: " + state);
    }
}