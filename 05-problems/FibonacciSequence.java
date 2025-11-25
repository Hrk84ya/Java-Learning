public class FibonacciSequence {
    // Recursive approach - O(2^n)
    public static int fibonacciRecursive(int n) {
        if (n <= 1) return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }
    
    // Dynamic Programming approach - O(n)
    public static int fibonacciDP(int n) {
        if (n <= 1) return n;
        
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
    
    // Space optimized approach - O(1)
    public static int fibonacciOptimized(int n) {
        if (n <= 1) return n;
        
        int prev2 = 0, prev1 = 1, current = 0;
        
        for (int i = 2; i <= n; i++) {
            current = prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
        }
        return current;
    }
    
    public static void main(String[] args) {
        int n = 10;
        
        System.out.println("Fibonacci sequence up to " + n + ":");
        System.out.print("Sequence: ");
        for (int i = 0; i <= n; i++) {
            System.out.print(fibonacciOptimized(i) + " ");
        }
        System.out.println();
        
        System.out.println("\nComparison for n = " + n + ":");
        System.out.println("Recursive: " + fibonacciRecursive(n));
        System.out.println("Dynamic Programming: " + fibonacciDP(n));
        System.out.println("Optimized: " + fibonacciOptimized(n));
    }
}