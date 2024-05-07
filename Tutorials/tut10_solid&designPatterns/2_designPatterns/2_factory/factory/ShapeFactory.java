package factory;

public class ShapeFactory {
    
    public Shape getShape(ShapeType shapeType){
        if (shapeType == null){
            return null;
        }
        else if(shapeType == ShapeType.Circle){

            Shape c =  new Circle();
            
            return c;

        }
        else if(shapeType == ShapeType.Rectangle){
            return new Rectangle();
        }
        else if(shapeType == ShapeType.Square){
            return new Square();
        }
        return null;
    }
}
