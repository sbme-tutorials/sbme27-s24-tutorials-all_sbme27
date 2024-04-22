public class Main {
    public static void main(String[] args) {

//        Shape shape = new Shape();

        Shape circle = new Circle(5);
        System.out.println("Area of circle: " + circle.calculateArea());

        circle.printArea();

        Shape rectangle = new Rectangle(4, 6);
        System.out.println("Area of rectangle: " + rectangle.calculateArea());

//        System.out.println("Area of square: " + square.calculateArea());

    }
}