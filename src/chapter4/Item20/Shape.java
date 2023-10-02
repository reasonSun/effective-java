package chapter4.Item20;

abstract class Shape {
    // 추상 메서드 정의 (하위 클래스에서 구현해야 함)
    public abstract double area();
    public abstract double perimeter();

}

// 추상 클래스를 상속받는 구체적인 클래스들
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public double perimeter() {
        return 2 * (width + height);
    }
}