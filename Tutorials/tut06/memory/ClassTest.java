import java.util.Arrays;
import java.util.stream.Collectors;

public class ClassTest {
    public static void main(String[] args){
        int[] main_arr = {1, 1, 1, 1, 1};

        printArr("main_arr before modify_array", "main", main_arr);

        int[] main_arr2 = modify_array(main_arr);
        printArr("main_arr after modify_array", "main", main_arr);
        printArr("main_arr2 after modify_array", "main", main_arr2);

    }

    public static int[] modify_array(int[] arr){
        arr[0] = 5;

        int[] arr2 = {3, 3, 3, 3, 3};
        arr = arr2;
        
        // int[] local_arr1 = arr;
        // local_arr1[4] = 5;
        printArr("arr after assigning it to 3s", "modify_array", arr);
        // printArr("local_arr1", "modify_array", local_arr1);
        
        // int[] local_arr = {1, 1, 5, 1, 1};
        return arr;
    }


    static void printArr(String comment, String func_name, int[] arr){
        String arr_string = Arrays.stream(arr)
        .mapToObj(String::valueOf)
        .collect(Collectors.joining(" "));
        System.out.printf("In %-15s %-30s %-12s %-20s\n", func_name, comment, System.identityHashCode(arr), arr_string);
    }
}
