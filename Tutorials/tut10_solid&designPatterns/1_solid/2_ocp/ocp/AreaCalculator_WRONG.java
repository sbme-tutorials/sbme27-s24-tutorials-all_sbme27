package ocp;
class Shape{}
class Circle extends Shape{

    public double getRadius() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getRadius'");
    }}
class Rectangle extends Shape{

    public int getLength() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getLength'");
    }

    public int getWidth() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getWidth'");
    }}

// Wrong implementation violating OCP
// Notes that this class has to be modified every time we add a new shape type "Open for modification!!"
public class AreaCalculator_WRONG {
    public double calculateArea(Shape shape) {
        double area = 0;
        if (shape instanceof Circle) {
            Circle circle = (Circle) shape;
            area = Math.PI * circle.getRadius() * circle.getRadius();
        } else if (shape instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) shape;
            area = rectangle.getLength() * rectangle.getWidth();
        }
        return area;
    }
}



