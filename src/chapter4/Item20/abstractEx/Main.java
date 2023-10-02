package chapter4.Item20.abstractEx;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("강아지",3);
        Cat cat = new Cat("고양이",3);

        System.out.println(dog.name);
        dog.move();
        dog.bark();

        System.out.println("\n"+cat.name);
        cat.move();
        cat.bark();
    }
}
