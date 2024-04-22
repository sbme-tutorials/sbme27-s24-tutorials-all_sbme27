package b_encapsulation.package1;

import b_encapsulation.package2.Person;

public class Main {
    public static void main(String[] args) {
        Person p = new Person("Ali");
        p.age = 5;
        // p.setName("M");
        System.out.println(p.getName());
        // p.setName("N");
    }
}
