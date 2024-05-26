package package2;

import zoo.Animal;

public class Dog extends Animal {
    private String name;
    public Dog(){
//        Animal("Dog");
        System.out.println("Dog Constructor Called");
    }

    public Dog(String name){
        this.name = name;
    }
    // Subclass-specific method
    public void bark() {

        System.out.println("Dog is barking...");
      }

      // Overriding superclass method
      @Override
      public void eat() {
          System.out.println("Dog is eating...");
      }
}
