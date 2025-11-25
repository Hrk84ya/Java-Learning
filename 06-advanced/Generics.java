// Generic class
class Box<T> {
    private T content;
    
    public void set(T content) {
        this.content = content;
    }
    
    public T get() {
        return content;
    }
}

// Generic method
class Utility {
    public static <T> void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    
    public static <T extends Comparable<T>> T findMax(T[] array) {
        T max = array[0];
        for (T element : array) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }
}

// Bounded type parameters
class NumberBox<T extends Number> {
    private T number;
    
    public NumberBox(T number) {
        this.number = number;
    }
    
    public double getDoubleValue() {
        return number.doubleValue();
    }
}

public class Generics {
    public static void main(String[] args) {
        // Generic class usage
        Box<String> stringBox = new Box<>();
        stringBox.set("Hello Generics");
        System.out.println("String Box: " + stringBox.get());
        
        Box<Integer> intBox = new Box<>();
        intBox.set(42);
        System.out.println("Integer Box: " + intBox.get());
        
        // Generic method usage
        String[] names = {"Alice", "Bob", "Charlie"};
        System.out.println("Before swap: " + java.util.Arrays.toString(names));
        Utility.swap(names, 0, 2);
        System.out.println("After swap: " + java.util.Arrays.toString(names));
        
        Integer[] numbers = {3, 7, 2, 9, 1};
        System.out.println("Max number: " + Utility.findMax(numbers));
        
        // Bounded type parameters
        NumberBox<Double> doubleBox = new NumberBox<>(3.14);
        System.out.println("Double value: " + doubleBox.getDoubleValue());
    }
}