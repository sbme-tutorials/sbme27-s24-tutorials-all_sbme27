package f_static;

import java.util.ArrayList;
import java.util.List;

public class Main {
    // update student count and list
    // move it to Student class
    public static void main(String[] args) {
        
        Student student1 = new Student("A");
        Student student2 = new Student("B");

        for(Student s : Student.students){
            System.out.println(s);
        }
    }
}
