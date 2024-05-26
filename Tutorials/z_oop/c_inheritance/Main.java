package c_inheritance;

public class Main {
    public static void main(String[] args) {
        // Vehicle v = new Vehicle("", "", "");
        Car c = new Car("BMW", "B", "1992", 4);
        Moto m = new Moto(null, null, null, 0);
        // Car c = new Car();

        System.out.println(c);
        // System.out.println(c.toString());
    }
}

// every class extends from object
// toString, print c or m
// make an array that contains cars and motos