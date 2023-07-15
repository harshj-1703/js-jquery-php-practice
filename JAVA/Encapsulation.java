/*
 * In this example, the Person class encapsulates the data (name and age) using
 * private instance variables and provides public getter and setter methods to
 * access and modify the data.
 * 
 * The name and age variables are declared as private, which means they can only
 * be accessed within the Person class itself. The public getter methods
 * (getName() and getAge()) allow other classes to retrieve the values of the
 * private variables, while the public setter methods (setName() and setAge())
 * provide controlled access to modify the values.
 * 
 * The setAge() method also demonstrates encapsulation by enforcing a validation
 * rule that the age cannot be negative. If someone tries to set a negative age,
 * a message will be printed instead of updating the value.
 * 
 * Using this approach, you can ensure that the data is accessed and modified
 * through controlled methods, allowing you to enforce validation rules, apply
 * business logic, and maintain the integrity of the object's state.
 */

class Person {
    private String name;
    private int age;

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Age cannot be negative.");
        }
    }
}

public class Encapsulation {
    /*
     * hen a variable is declared as static, it is shared among all instances of the
     * class. Only a single copy of the variable exists in memory, regardless of how
     * many instances of the class are created.
     */
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Harsh");
        p.setAge(20);
        System.out.println(
                p.getName() +
                        p.getAge());
    }
}