abstract class Animal {
    // Abstract method (does not have a body)
    public abstract void makeSound();
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.makeSound();  // Prints: Meow

        Dog dog = new Dog();
        dog.makeSound();  // Prints: Woof
    }
}

class Dog extends Animal {
    // The body of the abstract method is provided here
    public void makeSound() {
        System.out.println("Woof");
    }
}

class Cat extends Animal {
    // The body of the abstract method is provided here
    public void makeSound() {
        System.out.println("Meow");
    }
    
    
}

