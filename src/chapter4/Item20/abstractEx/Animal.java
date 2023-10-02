package chapter4.Item20.abstractEx;

public abstract class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void move() {System.out.println("이동한다");}
    public void eat() {System.out.println("먹는다");}
    public abstract void bark(); //짖는 소리는 동물마다 다르므로 추상메서드로 생성
}