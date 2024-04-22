package c_inheritance;

public class Car extends Vehicle {
    private int numDoors;

    // public Car(){
    //     // super("", "", "");
    //     System.out.println("Car created");
    // }
    public Car(String comapny, String model, String year, int numDoors) {
        super(comapny, model, year);
        this.numDoors = numDoors;
    }

    public int getNumDoors() {
        // super.getYear();
        // this.year = "asdf";
        return numDoors;
    }

    // @Override
    public String toStringt() {
        // TODO Auto-generated method stub
        return super.getCompany() + " " + super.getYear();
    }

    @Override
    int calculateFuel() {
        // TODO Auto-generated method stub
        return 6;
    }
}
