package decorator;

public class DecoratedCalculator extends Calculator{
    
    @Override
    public int add(int x, int y) {
        System.out.println("==========================================================");
        // pre logic
        int result = super.add(x, y);
        // post logic
        System.out.println("The result of adding %d and %d is %d".formatted(x, y, result));
        System.out.println("==========================================================");
        return result;
    }
}
