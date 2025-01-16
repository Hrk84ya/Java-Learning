public class LinearSearch {
    public static int linearSearch(int[] arr, int target) {
        // Check if the array is empty
        if (arr == null || arr.length == 0) {
            return -1;
        }
        // Iterate through the array to find the target element
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        // Return -1 if the target element is not found
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int target = 4;
        int result = linearSearch(arr, target);
        if (result != -1) {
            System.out.println("Target element found at index " + result);
        } else {
            System.out.println("Target element is not present in the array");
        }
    }
};
