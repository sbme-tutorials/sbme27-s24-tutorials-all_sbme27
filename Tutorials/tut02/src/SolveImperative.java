import java.util.ArrayList;
import java.util.Scanner;

public class SolveImperative {
    public static void solve() {
        int[] nums = {1, 4, 3, 6, 7, 8, 9, 2};
        int[] result = new int[nums.length]; // Assuming the result array won't exceed the size of nums
        int resultIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 5) {
                result[resultIndex] = nums[i];
                resultIndex++;
            }
        }

        // Create a new array with the exact size of elements that meet the condition
        int[] finalResult = new int[resultIndex];
        System.arraycopy(result, 0, finalResult, 0, resultIndex);

        // Print the final result
        for (int num : finalResult) {
            System.out.print(num + " ");
        }
    }
}
