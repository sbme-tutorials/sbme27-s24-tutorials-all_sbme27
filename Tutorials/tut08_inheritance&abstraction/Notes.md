# OOP Notes

1. Impicit call for the parameterless constructor

    ``` java
    public class SuperClass {
        public SuperClass() {
            System.out.println("SuperClass constructor");
        }
    }

    public class SubClass extends SuperClass {
        public SubClass() {
            super(); // Implicit call to superclass constructor
            System.out.println("SubClass constructor");
        }
    }

    // Usage
    SubClass obj = new SubClass();
    // Output:
    // SuperClass constructor
    // SubClass constructor
    ```

2. All Classes inherits from Object

    ``` java
    public class MyClass {
        // MyClass implicitly inherits from Object class
        // Methods like toString(), hashCode(), equals(), getClass() are inherited
        private int data;

        public MyClass(int data) {
            this.data = data;
        }
    }

    // Usage
    MyClass obj = new MyClass(10);
    System.out.println(obj.toString()); // Output: MyClass@1f6f0d0
    System.out.println(obj.hashCode()); // Output: some hash code
    System.out.println(obj.getClass()); // Output: class MyClass
    ```

3. super keyword

    ```java
    public class SuperClass {
        public void display() {
            System.out.println("SuperClass display()");
        }
    }

    public class SubClass extends SuperClass {
        public void display() {
            super.display(); // Calls superclass method
            System.out.println("SubClass display()");
        }
    }

    // Usage
    SubClass obj = new SubClass();
    obj.display();
    // Output:
    // SuperClass display()
    // SubClass display()
    ```

4. toString and hash functions
5. Final Keyword

    ```java
    public final class FinalClass {
        final public int x = 10;
        public final void finalMethod() {
            System.out.println("FinalClass finalMethod()");
        }
    }

    // Trying to extend a final class (will result in a compilation error)
    // public class SubClass extends FinalClass { }

    // Trying to override a final method (will result in a compilation error)
    // public class SubClass extends FinalClass {
    //     public void finalMethod() {
    //         System.out.println("SubClass finalMethod()");
    //     }
    // }

    // Trying to change the value of x (will result in a compilation error)
    // public class SubClass extends 
    ```

6. Method Overriding
7. Multiple Inheritance, Dimaond Problem
    - Java doesn't support multiple inheritance but you can achieve this using interfaces 
    - Read [Mehtod Resolution Order in Python](http://python-history.blogspot.com/2010/06/method-resolution-order.html)
8. Covariant Return Type

    ```java
    class SuperClass {
        SuperClass get() {
            return this;
        }
    }

    class SubClass extends SuperClass {
        @Override
        SubClass get() { // Covariant return type
            return this;
        }
    }

    // Usage
    SubClass obj = new SubClass();
    System.out.println(obj.get()); // Output: SubClass@1f6f0d0
    ```

9. Inheritance = “is-a” relationship, Composition = “has-a” relationship