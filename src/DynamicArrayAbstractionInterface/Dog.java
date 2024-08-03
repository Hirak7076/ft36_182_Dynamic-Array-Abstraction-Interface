package DynamicArrayAbstractionInterface;

interface Animal2 {
    void makeSound();
    void sleep();
}

class Cat implements Animal2 {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Woof Woof");
    }

    @Override
    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

