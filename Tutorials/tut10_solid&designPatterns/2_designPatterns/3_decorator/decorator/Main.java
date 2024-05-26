package decorator;

public class Main {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        Calculator decoratedC = new DecoratedCalculator();
        System.out.println(c.add(3, 5));
        decoratedC.add(3, 5);
    }
}
