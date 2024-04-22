package e_polymorphism;

public class Cat extends Animal {
    
    @Override
    // change the function name
    public void makeSound() {
      System.out.println("The cat meows");
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Cat";
    }
  }
