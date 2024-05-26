package factory;

public class Main {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        //get an object of Circle and call its draw method.
        Shape shape1 = shapeFactory.getShape(ShapeType.Circle);
        //call draw method of Circle
        shape1.draw();
        //get an object of Rectangle and call its draw method.
        Shape shape2 = shapeFactory.getShape(ShapeType.Rectangle);
        //call draw method of Rectangle
        shape2.draw();
        //get an object of Square and call its draw method.
        Shape shape3 = shapeFactory.getShape(ShapeType.Square);
        //call draw method of circle
        shape3.draw();
    }
    
}
