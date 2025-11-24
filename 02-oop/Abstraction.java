abstract class Shape {
    protected String color;
    
    public Shape(String color) {
        this.color = color;
    }
    
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
    
    public void displayInfo() {
        System.out.println("Color: " + color);
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
    }
}

class Rectangle extends Shape {
    private double length, width;
    
    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }
    
    @Override
    public double calculateArea() {
        return length * width;
    }
    
    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

class Circle extends Shape {
    private double radius;
    
    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }
    
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle("Red", 5, 3);
        Shape circle = new Circle("Blue", 4);
        
        System.out.println("Rectangle:");
        rectangle.displayInfo();
        
        System.out.println("\nCircle:");
        circle.displayInfo();
    }
}