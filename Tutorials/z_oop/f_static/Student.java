package f_static;

import java.util.ArrayList;
import java.util.List;

public class Student {
    public static List<Student> students = new ArrayList<Student>();

    public String name;

    Student(String name) {
        this.name = name;
        students.add(this);
    }

    @Override
    public String toString() {
        return this.name;
    }
}
