package chapter4.Item20.abstractEx;

public class Dog extends Animal{

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void bark() { //메서드 오버라이딩
        System.out.println("멍멍!!");
    };
}
