package coffee_decorator;

// Step 5: Client Code
public class DecoratorPatternExample {
    public static void main(String[] args) {
        System.out.println("");
        Coffee simpleCoffee = new SimpleCoffee();
        System.out.println("Cost: " + simpleCoffee.getCost() + ", Description: " + simpleCoffee.getDescription());

        Coffee milkCoffee = new Milk(simpleCoffee);
        System.out.println("Cost: " + milkCoffee.getCost() + ", Description: " + milkCoffee.getDescription());

        Coffee milkSugarCoffee = new Sugar(milkCoffee);
        System.out.println("Cost: " + milkSugarCoffee.getCost() + ", Description: " + milkSugarCoffee.getDescription());
    }
}