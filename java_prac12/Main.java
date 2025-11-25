// Abstract class
abstract class Animal {
    
    // Abstract method (no body)
    abstract void sound();

    // Normal method
    void sleep() {
        System.out.println("Animals sleep.");
    }
}

// Subclass inherits the abstract class
class Dog extends Animal {
    
    // Implementing the abstract method
    void sound() {
        System.out.println("Dog barks: Woof Woof!");
    }
}

public class Main {
    public static void main(String[] args) {
        // Animal a = new Animal();   Not allowed (abstract)

        Dog d = new Dog();   // ✔ Allowed
        d.sound();
        d.sleep();
    }
}

