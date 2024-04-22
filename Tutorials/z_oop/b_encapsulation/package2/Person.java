package b_encapsulation.package2;

public class Person {
    private String name;
    public int age;

    Person(){}

    public Person(String name){
        this.name = name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    // private String name;
    // private int age;

    // public String getName() {
    //     return name;
    // }

    // public void setName(String name) {
    //     this.name = name;
    // }

    // public int getAge() {
    //     return age;
    // }

    // public void setAge(int age) {
    //     this.age = age;
    // }
}