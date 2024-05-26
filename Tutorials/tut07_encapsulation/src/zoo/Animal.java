package zoo;

public class Animal {
//    int legs;
    String name;
//
    public Animal(){
        System.out.println("Animal Constructor Called");
    }

//    public Animal(String name){
//        System.out.println(name + " Constructor with parameter");
//        this.name = name;
//    }

     public void eat() {
          System.out.println("Animal is eating...");
      }
      protected void sleep() {
          System.out.println("Animal is sleeping...");
      }

      // Default method
      void roam() {
         System.out.println("Animal is roaming...");
      }

       private void breathe() {
          System.out.println("Animal is breathing...");
      }

}

/**
 * // Superclass
 * public class Animal {
 *     // Public method
 *     public void eat() {
 *         System.out.println("Animal is eating...");
 *     }
 *
 *     // Protected method
 *     protected void sleep() {
 *         System.out.println("Animal is sleeping...");
 *     }
 *
 *     // Default method
 *     void roam() {
 *         System.out.println("Animal is roaming...");
 *     }
 *
 *     // Private method
 *     private void breathe() {
 *         System.out.println("Animal is breathing...");
 *     }
 * }
 *
 * // Subclass inheriting from Animal
 * public class Dog extends Animal {
 *     // Subclass-specific method
 *     public void bark() {
 *         System.out.println("Dog is barking...");
 *     }
 *
 *     // Overriding superclass method
 *     @Override
 *     public void eat() {
 *         System.out.println("Dog is eating...");
 *     }
 * }
 *
 * // Main class
 * public class Main {
 *     public static void main(String[] args) {
 *         Dog dog = new Dog();
 *         dog.eat();   // Calls overridden method in Dog class
 *         dog.sleep(); // Calls inherited method from Animal class
 *         dog.roam();  // Calls inherited method from Animal class
 *         // dog.breathe(); // Error: Private method not accessible
 *         dog.bark();  // Calls method specific to Dog class
 *     }
 * }
 */