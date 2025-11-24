import java.util.HashSet;

public class ZeroSumSubarray {
    public static boolean checkSubarray(int[] nums) {
        int sum = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            sum += num;
            if (set.contains(sum) || sum == 0) {
                return true;
            }
            set.add(sum);
            }
        return false;
        }
    public static void main(String[] args) {
        int[] nums = {4, 2, -3, 1, 6};
        System.out.println(checkSubarray(nums));
    }  
    
}
