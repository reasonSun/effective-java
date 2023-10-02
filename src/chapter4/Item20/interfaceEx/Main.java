package chapter4.Item20.interfaceEx;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.move();
        cat.move();

        dog.bark();
        cat.bark();

        System.out.println(dog.printAnimal());
        System.out.println(cat.printAnimal());
    }
}
