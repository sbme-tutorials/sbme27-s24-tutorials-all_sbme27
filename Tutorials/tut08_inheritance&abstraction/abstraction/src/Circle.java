// Concrete subclass of Shape representing a circle
class Circle extends Shape implements Drawable {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // todo: drawable interface

    @Override
    public void draw() {
        System.out.println("Draw Circle");
    }

    // Implementing the abstract method to calculate area for a circle
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

//    @Override
//    public int compareTo(Object o) {
//        return 0;
//    }

    public void printArea(){
        System.out.printf("Area = %1$20.2f\n", this.calculateArea());
    }
}