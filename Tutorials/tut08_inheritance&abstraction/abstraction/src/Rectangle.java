// Concrete subclass of Shape representing a rectangle
class Rectangle extends Shape implements Drawable {
    private double length;
    private double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println("Draw Rect");
    }

    // Implementing the abstract method to calculate area for a rectangle
    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

//    public void printArea(){
//        System.out.printf("Area = %1$20.2f\n", this.calculateArea());
//    }
}