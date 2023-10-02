package chapter4.Item20.interfaceEx;

public class Dog implements Animal {

    @Override
    public void move() {
        System.out.println("슥슥~~");
    }

    @Override
    public void eat() {

    }

    @Override
    public void bark() {
        System.out.println("멍멍");
    }
}
