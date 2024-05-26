import java.util.ArrayList;
import java.util.Scanner;

public class Prop1 {
    public static void solve(){
        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        System.out.printf("x = %d\n", x);
        ArrayList<Integer> y = new ArrayList<Integer>();
        y.add(5);
        y.add(7);
        y.add(0, 6);
        y.forEach(integer -> System.out.println(integer));


        String input = "asdf jk kjl";

        System.out.println(input.substring(0, 2));
//        Boolean transform = input.transform();

        String[] words = input.split("\\s+");
        System.out.println(words.length);
    }
}
