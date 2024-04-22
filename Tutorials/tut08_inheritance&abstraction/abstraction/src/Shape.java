abstract class Shape { // implements Comparable<Shape>
    // Abstract method to calculate area (to be implemented by subclasses)
    protected double area;
    public abstract double calculateArea();

//    @Override
//    public int compareTo(Shape o) {
//        return Double.compare(this.area, o.area);
//    }


    //  Common Functionality with default implementation
    public void printArea(){
        System.out.printf("Area = %1$20.2f\n", this.calculateArea(), 21421.213);
    }
}