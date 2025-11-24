public class BinarySearch {
    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = { 11, 21, 34, 45, 56, 78, 89, 90 };
        int target = 21;
        int result = binarySearch(arr, target);
        if (result != -1) {
            System.out.println("Target element found at index " + result);
        } else {
            System.out.println("Target element is not present in the array");
        }
    }
}
