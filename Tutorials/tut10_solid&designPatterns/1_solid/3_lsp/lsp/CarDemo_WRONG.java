package lsp;
class Engine {

    public void on() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'on'");
    }

    public void powerOn(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'powerOn'");
    }
}

abstract class Car {

    abstract void accelerate();
}

class MotorCar extends Car {

    // Constructors, getters + setters

    private Engine engine;
    void turnOnEngine() {
        // turn on the engine!
        engine.on();
    }

    void accelerate(){
        engine.powerOn(1000);
    }
}

class ElectricCar extends Car {

    public void accelerate() {
        // this acceleration is crazy!
    }
}

public class CarDemo_WRONG {
    public static void main(String[] args) {

        // Replace it with Electric Car and you will get an error thrown by turnOnEngine
        // because Electric Car doesn't have an engine
        Car motorCar = new ElectricCar();
        // motorCar.turnOnEngine();
        motorCar.accelerate();
    }
}