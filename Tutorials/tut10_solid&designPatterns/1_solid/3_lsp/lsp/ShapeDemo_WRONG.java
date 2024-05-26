package lsp;
// Wrong implementation violating LSP
class Rectangle {
    protected int width;
    protected int height;

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getArea() {
        return width * height;
    }
}

class Square extends Rectangle {
    @Override
    public void setWidth(int width) {
        this.width = width;
        this.height = width; // Make the height same as width
    }

    @Override
    public void setHeight(int height) {
        this.height = height;
        this.width = height; // Make the width same as height
    }
}


public class ShapeDemo_WRONG{
 
    public static void main(String[] args) {

        // replace Square with Rectangle violates LSP
        Rectangle rectangle = new Square();
        rectangle.setHeight(5);
        rectangle.setWidth(4);
        System.out.println(rectangle.getArea());
        
    }
}