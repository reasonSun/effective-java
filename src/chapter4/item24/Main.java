package chapter4.item24;

class Anonymous {
    public String test() {
        return "anonymous";
    }
}

public class Main {
    public static void main(String[] args) {
        Anonymous anonymous = new Anonymous() {
            @Override
            public String test() {
                return "anonymous_main";
            }
        };

        System.out.println(anonymous.test());
    }
}