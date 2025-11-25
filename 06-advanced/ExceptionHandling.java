// Custom exception
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class Person {
    private String name;
    private int age;
    
    public Person(String name, int age) throws InvalidAgeException {
        this.name = name;
        setAge(age);
    }
    
    public void setAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 150) {
            throw new InvalidAgeException("Age must be between 0 and 150");
        }
        this.age = age;
    }
    
    public String toString() {
        return name + " (age: " + age + ")";
    }
}

public class ExceptionHandling {
    public static void demonstrateExceptions() {
        // Try-catch-finally
        try {
            int[] arr = {1, 2, 3};
            System.out.println("Element: " + arr[5]); // ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed");
        }
        
        // Multiple catch blocks
        try {
            String str = null;
            System.out.println(str.length()); // NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Null pointer exception caught");
        } catch (Exception e) {
            System.out.println("General exception: " + e.getMessage());
        }
    }
    
    public static void demonstrateCustomException() {
        try {
            Person person1 = new Person("Alice", 25);
            System.out.println("Created: " + person1);
            
            Person person2 = new Person("Bob", -5); // Invalid age
        } catch (InvalidAgeException e) {
            System.out.println("Custom exception: " + e.getMessage());
        }
    }
    
    public static void demonstrateThrows() throws Exception {
        throw new Exception("This is a thrown exception");
    }
    
    public static void main(String[] args) {
        System.out.println("=== Exception Handling Demo ===");
        
        demonstrateExceptions();
        System.out.println();
        
        demonstrateCustomException();
        System.out.println();
        
        // Try-with-resources would go here for file handling
        try {
            demonstrateThrows();
        } catch (Exception e) {
            System.out.println("Caught thrown exception: " + e.getMessage());
        }
    }
}