import java.util.Scanner;
import java.util.Arrays;
public class NGE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            }
        int[] result = nextGreaterElement(arr);
        System.out.println("Next greater element for each element in the array:");
        System.out.println(Arrays.toString(result));
        scanner.close();
    }
    public static int[] nextGreaterElement(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int nextGreater = -1;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] > nums[i]) {
                    nextGreater = nums[j];
                    break;
                }
            }
            result[i] = nextGreater;
            }
        return result;
    }
}