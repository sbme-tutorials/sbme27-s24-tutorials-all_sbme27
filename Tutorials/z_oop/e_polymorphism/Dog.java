package e_polymorphism;

public class Dog extends Animal {
    public void makeSound() {
        System.out.println("The dog barks");
    }

    @Override
    public String toString() {
        return "Dog";
    }
}
