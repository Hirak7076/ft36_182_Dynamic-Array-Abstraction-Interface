package DynamicArrayAbstractionInterface;

abstract class Animal {

	private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Abstract method
    public abstract void makeSound();

    // Non-abstract method
    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    // Providing implementation for abstract method
    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Woof Woof");
    }
}


