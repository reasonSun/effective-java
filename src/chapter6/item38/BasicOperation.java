package chapter6.item38;

public enum BasicOperation implements Operation{
    PLUS("+"){
        @Override
        public double apply(double x, double y) {
            return x+y;
        }
    },
    MINUS("-"){
        @Override
        public double apply(double x, double y) {
            return x-y;
        }
    };

    private final String symbol;

    BasicOperation(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return symbol;
    }

    public static void main(String[] args) {
        double x = 10.0;
        double y = 5.0;

        Operation plus = BasicOperation.PLUS;
        Operation minus = BasicOperation.MINUS;

        System.out.println(x + " " + plus + " " + y + " = " + plus.apply(x, y));
        System.out.println(x + " " + minus + " " + y + " = " + minus.apply(x, y));
    }
}
