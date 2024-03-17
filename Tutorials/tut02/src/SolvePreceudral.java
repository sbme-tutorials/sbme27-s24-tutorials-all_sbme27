import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class SolvePreceudral {

    public static void solve(String[] args) {
        int[] nums = initializeArrayFromUserInput();
        int[] result = filterNumbersGreaterThanFive(nums);

        // Print the result
        printIntArray(result);
    }

    public static int[] initializeArrayFromUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            nums[i] = scanner.nextInt();
        }

        return nums;
    }

    public static int[] filterNumbersGreaterThanFive(int[] nums) {
        List<Integer> resultList = new ArrayList<>();

        for (int num : nums) {
            if (num > 5) {
                resultList.add(num);
            }
        }

        // Convert List to array
        return resultList.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void printIntArray(int[] array) {
        System.out.print("Result: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
