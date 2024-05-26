package c_inheritance;

public abstract class Vehicle {
    private String company;
    private String model;
    private String year;

    // public Vehicle(){
    //     System.out.println("Vehicle created");
    // }

    abstract int calculateFuel();

    public Vehicle(String make, String model, String year) {
        this.company = make;
        this.model = model;
        this.year = year;
    }

    public String getCompany() {
        return company;
    }

    public String getModel() {
        return model;
    }

    public String getYear() {
        return year;
    }

    // @Override
    // public String toString() {
    //     // TODO Auto-generated method stub
    //     return "vehicle string";
    // }
}

