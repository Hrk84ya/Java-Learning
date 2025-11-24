public class Arrays {
    public static void main(String[] args) {
        // Array declaration and initialization
        int[] numbers = {1, 2, 3, 4, 5};
        String[] names = new String[3];
        names[0] = "Alice";
        names[1] = "Bob";
        names[2] = "Charlie";
        
        // Print array elements
        System.out.println("Numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index " + i + ": " + numbers[i]);
        }
        
        System.out.println("\nNames:");
        for (String name : names) {
            System.out.println(name);
        }
        
        // Array operations
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("\nSum of numbers: " + sum);
        System.out.println("Array length: " + numbers.length);
    }
}