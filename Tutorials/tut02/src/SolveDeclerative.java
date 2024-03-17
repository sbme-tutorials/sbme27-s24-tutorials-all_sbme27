import java.io.Console;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SolveDeclerative {
    public static void main(String[] args) {
        int[] nums = initializeArrayFromUserInput();
        int[] result = filterNumbersGreaterThanFive(nums);
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
        return Arrays.stream(nums)
                .filter(num -> num > 5)
                .toArray();
    }

    public static void printIntArray(int[] array) {
        System.out.print("Result: ");
        Arrays.stream(array)
                .forEach(num -> System.out.print(num + " "));
        System.out.println();
    }
}
