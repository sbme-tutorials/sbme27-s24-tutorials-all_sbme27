# Notes

[Link](https://www.mygreatlearning.com/blog/the-access-modifiers-in-java/#:~:text=The%20four%20access%20modifiers%20in,protected%2C%20default%2C%20and%20private.)

- When a class is marked as public, it can be used by other classes in other packages, and can be accessed using the import statement. Without the public keyword, a class would have the default access modifier, which means it can only be accessed within the same package.

- It's important to note that a Java file can contain only one public class declaration, and the name of the file must match the name of the public class. If there are additional non-public classes defined in the same file, they can be accessed only from within the same file or from other classes within the same package.

- It is generally recommended to use the private access modifier for fields and to provide public methods to access and modify the values of those fields.
