// Concrete subclass of Shape representing a circle
class Circle extends Shape {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementing the abstract method to calculate area for a circle
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}