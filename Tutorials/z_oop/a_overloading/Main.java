package a_overloading;

class Main{
    public static void main(String[] args){
        Calculator c = new Calculator();
        double x = c.add(3.0, 4);
        System.out.println(x);
    }
}