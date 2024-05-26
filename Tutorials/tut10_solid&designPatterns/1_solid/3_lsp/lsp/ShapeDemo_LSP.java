package lsp;
// Corrected implementation following LSP
abstract class Shape {
    abstract int getArea();
}

class Rectangle extends Shape {
    protected int width;
    protected int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public int getArea() {
        return width * height;
    }
}

class Square extends Shape {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public int getArea() {
        return side * side;
    }
}


public class ShapeDemo_LSP {
    public static void main(String[] args) {

        // // that code that violates LSP
        // Rectangle rectangle = new Rectangle();
        // rectangle.setHeight(5);
        // rectangle.setWidth(4);
        // System.out.println(rectangle.getArea());

        // that code that follows LSP
        // Shape rectangle = new Rectangle(5, 4);
        Shape rectangle = new Square(6);
        System.out.println(rectangle.getArea());
        
    }
}
