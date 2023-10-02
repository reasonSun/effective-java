package chapter4.item24;

public class TestClass {
    static int staticVariable = 0;
    int nonStaticVariable = 0;
    class InnerClass {
        void accessStaticVariable() {
            TestClass.staticVariable += 1;
        }

        void accessNonStaticVariable() {
            TestClass.this.nonStaticVariable += 1; // 숨은 외부참조를 갖는다. -> 가비지컬렉션이 제대로 이루어지지 않아 메모리 누수 발생

        }
    }
    static class NestedClass {
        void accessStaticVariable() {
            TestClass.staticVariable += 1;
        }

        void accessNonStaticVariable() {
//            TestClass.this.nonStaticVariable += 1; 컴파일 에러, 숨은 외부참조를 갖지 않는다.

        }
    }

    public static void main(String[] args) {
        // 1. 내부 클래스로 인스턴스를 두번 생성하면?(외부 클래스 인스턴스를 이용해 내부 클래스 인스턴스 생성)
        TestClass.InnerClass inner1 = new TestClass().new InnerClass();
        TestClass.InnerClass inner2 = new TestClass().new InnerClass();

        if(inner1 == inner2) System.out.println("same");
        else System.out.println("different");
        // 내부 클라스라 하더라도 결국 클래스이기 때문에 다른 인스턴스

        // 2. 정적멤버클래는 new 연산자를 한번만 사용해도 새로운 인스턴스를 만들 수 있다.
        TestClass.NestedClass nested1 = new TestClass.NestedClass();
        TestClass.NestedClass nested2 = new TestClass.NestedClass();

        if(nested1 == nested2) System.out.println("same");
        else System.out.println("different");
        // 다른참조다 static 이라는 키워드가 클래스에 붙게 된다면 인스턴스를 생성하는 방식이 달라지는 것이지 클래스가 갑자기 인스턴스의 역할을 하지 못한다
    }
}
