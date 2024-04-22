import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        SuperClass sub1 = new SubClass();
        SuperSuperClass super1 = new SuperClass();

        List<Object> arr = new ArrayList<Object>();
        arr.add(sub1);
        arr.add(super1);



//        SubClass sub2 = new SubClass();
//        SubClass sub3 = new SubClass();

//        System.out.printf("sub1 %s\n", sub1);
//        System.out.printf("sub2 %s\n", sub2);
//        System.out.printf("sub3 %s\n", sub3);
//        System.out.printf("sub1 %s\n", sub1);
//        System.out.printf("sub2 %s\n", sub2);
//        System.out.printf("sub3 %s\n", sub3);

//        SuperSuperClass sub1 = new SubClass();

//         sub1.

//        System.out.println(sub1);
        sub1.display();
//        System.out.println(sub1 instanceof SuperClass);
//        System.out.println(sub1.getClass());
    }
}