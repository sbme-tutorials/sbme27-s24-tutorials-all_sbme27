# Interface vs Abstract Class

| Feature               | Interface                                             | Abstract Class                                        |
|-----------------------|-------------------------------------------------------|-------------------------------------------------------|
| Definition            | Blueprint of a class with method signatures          | Class with abstract and/or concrete methods            |
| Implementation        | Classes implement interfaces by providing methods     | Subclasses extend abstract class and provide methods   |
| Fields                | Cannot contain fields                                 | Can contain fields                                    |
| Constructor           | Cannot have constructors                              | Can have constructors                                 |
| Usage                 | Defines contract for classes with different behaviors | Provides default implementation for subclasses        |
| Multiple Inheritance  | A class can implement multiple interfaces             | A class can only inherit from one abstract class      |
| Level of Abstraction | Higher level, only defines a contract                 | Provides abstraction, can contain concrete methods    |
