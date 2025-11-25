// Interface
interface Animal {
    void sound();  // abstract method
}

// Class implementing the interface
class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks: Woof Woof!");
    }
}

// Another class implementing the interface
class Cat implements Animal {
    public void sound() {
        System.out.println("Cat meows: Meow Meow!");
    }
}

public class Animal2 {
    public static void main(String[] args) {
        Animal d = new Dog();
        Animal c = new Cat();

        d.sound();
        c.sound();
    }
}