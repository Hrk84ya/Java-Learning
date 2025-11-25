import java.util.HashMap;
import java.util.Arrays;

public class TwoSum {
    // Brute force approach - O(n²)
    public static int[] twoSumBruteForce(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
    
    // HashMap approach - O(n)
    public static int[] twoSumHashMap(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
    
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        
        System.out.println("Array: " + Arrays.toString(nums));
        System.out.println("Target: " + target);
        
        int[] result1 = twoSumBruteForce(nums, target);
        System.out.println("Brute Force Result: " + Arrays.toString(result1));
        
        int[] result2 = twoSumHashMap(nums, target);
        System.out.println("HashMap Result: " + Arrays.toString(result2));
        
        if (result2.length > 0) {
            System.out.println("Values: " + nums[result2[0]] + " + " + nums[result2[1]] + " = " + target);
        }
    }
}