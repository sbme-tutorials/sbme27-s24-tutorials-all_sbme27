package c_inheritance;

public class Moto extends Vehicle {
    public Moto(String company, String model, String year, int numDoors) {
        super(company, model, year);
    }

    @Override
    int calculateFuel() {
        // TODO Auto-generated method stub
        return 7;
    }
}
