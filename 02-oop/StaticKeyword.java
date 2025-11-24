class Counter {
    private static int count = 0; // Static variable
    private int instanceId;
    
    // Static block
    static {
        System.out.println("Static block executed");
        count = 100;
    }
    
    public Counter() {
        count++;
        instanceId = count;
    }
    
    // Static method
    public static int getCount() {
        return count;
    }
    
    // Static method cannot access instance variables directly
    public static void resetCount() {
        count = 0;
    }
    
    public void displayInfo() {
        System.out.println("Instance ID: " + instanceId + ", Total Count: " + count);
    }
}

class MathUtils {
    public static final double PI = 3.14159; // Static final variable
    
    public static double calculateCircleArea(double radius) {
        return PI * radius * radius;
    }
    
    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }
}

public class StaticKeyword {
    public static void main(String[] args) {
        System.out.println("Initial count: " + Counter.getCount());
        
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        
        c1.displayInfo();
        c2.displayInfo();
        c3.displayInfo();
        
        System.out.println("Final count: " + Counter.getCount());
        
        // Using static methods without creating objects
        System.out.println("Circle area: " + MathUtils.calculateCircleArea(5));
        System.out.println("Max value: " + MathUtils.max(10, 20));
    }
}