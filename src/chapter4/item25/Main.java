package chapter4.item25;

public class Main {
    public static void main(String[] args) {
        System.out.println(Utensil.NAME + Desert.NAME);
    }

    private static class Utensil {
        static final String NAME = "pan";
    }

    private static class Desert {
        static final String NAME = "cake";
    }

}
