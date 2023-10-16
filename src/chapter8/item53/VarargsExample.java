package chapter8.item53;

public class VarargsExample {
    static int sum(int... args) {
        int sum = 0;
        for(int arg : args)
            sum += arg;
        return sum;
    }

    static int min(int firstArg, int... remainingArgs) {
        int min = firstArg;
        for (int arg : remainingArgs) {
            if (arg < min) {
                min = arg;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int result = sum();
        System.out.println(result);

        int result1 = min(2,3,1,45);
        System.out.println(result1);
    }
}
