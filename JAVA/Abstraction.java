/*
 * Abstraction is a process of hiding implementation details and exposes only
 * the functionality to the user. In abstraction, we deal with ideas and not
 * events. This means the user will only know “what it does” rather than “how it
 * does”.
 * 
 * There are two ways to achieve abstraction in Java
 * 
 * Abstract class (0 to 100%)
 * Interface (100%)
 * Real-Life Example: A driver will focus on the car functionality (Start/Stop
 * -> Accelerate/ Break), he/she does not bother about how the Accelerate/ brake
 * mechanism works internally. And this is how the abstraction works.
 */

// Abstract class
abstract class Shape {
    // Abstract method
    public abstract void draw();

    // Concrete method
    public void displayArea() {
        System.out.println("Calculating area...");
    }
}

// Concrete class inheriting from the abstract class
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementation of the abstract method
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

// Concrete class inheriting from the abstract class
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implementation of the abstract method
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}

// Main class
public class Abstraction {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);

        circle.draw(); // Call to abstract method
        circle.displayArea(); // Call to concrete method

        rectangle.draw(); // Call to abstract method
        rectangle.displayArea(); // Call to concrete method
    }
}
