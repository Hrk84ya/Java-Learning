public class Methods {
    // Method with no parameters and no return value
    public static void greet() {
        System.out.println("Hello from greet method!");
    }
    
    // Method with parameters and return value
    public static int add(int a, int b) {
        return a + b;
    }
    
    // Method with multiple parameters
    public static double calculateArea(double length, double width) {
        return length * width;
    }
    
    // Method overloading
    public static int multiply(int a, int b) {
        return a * b;
    }
    
    public static double multiply(double a, double b) {
        return a * b;
    }
    
    public static void main(String[] args) {
        greet();
        
        int sum = add(5, 3);
        System.out.println("Sum: " + sum);
        
        double area = calculateArea(5.5, 3.2);
        System.out.println("Area: " + area);
        
        System.out.println("Multiply int: " + multiply(4, 5));
        System.out.println("Multiply double: " + multiply(4.5, 2.3));
    }
}