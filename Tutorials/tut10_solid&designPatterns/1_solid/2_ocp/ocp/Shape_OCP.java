package ocp;
// Corrected implementation following OCP
// Notice the flexibilty of adding new shapes

public interface Shape_OCP {
    double area();
}

// Circle class implementing Shape interface
class Circle implements Shape_OCP {
    private double radius;

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

// Rectangle class implementing Shape interface
class Rectangle implements Shape_OCP {
    private double length;
    private double width;

    @Override
    public double area() {
        return length * width;
    }
}
