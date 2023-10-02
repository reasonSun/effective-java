package chapter4.Item20.interfaceEx;

public class Cat implements Animal{
    @Override
    public void move() {
        System.out.println("사뿐");
    }

    @Override
    public void eat() {

    }

    @Override
    public void bark() {
        System.out.println("야옹");
    }
}
