// Parent class
class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass 1
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }

    public void fetch() {
        System.out.println("Dog fetches a ball");
    }

    public void fetch(String item) {
        System.out.println("Dog fetches " + item);
    }
}

// Subclass 2
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat meows");
    }

    public void scratch() {
        System.out.println("Cat scratches furniture");
    }
}

// Main class
public class Polymorphism {
    public static void main(String[] args) {
        Animal animal1 = new Dog(); // Runtime polymorphism
        Animal animal2 = new Cat(); // Runtime polymorphism
        Animal animal3 = new Animal(); // Compile-time polymorphism

        animal1.makeSound(); // Calls the overridden makeSound() method of Dog at runtime
        animal2.makeSound(); // Calls the overridden makeSound() method of Cat at runtime
        animal3.makeSound(); // Calls the makeSound() method of Animal at compile time

        // Overloading
        Dog dog = new Dog();
        dog.fetch(); // Calls the fetch() method of Dog
        dog.fetch("tennis ball"); // Calls the overloaded fetch(String) method of Dog
    }
}
