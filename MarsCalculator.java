public class MarsCalculator {
//    public int sum(int a, int b, int c) {
//        return a + b + c;
//    }
//
//    public int sub(int a, int b, int c) {
//        return a - b - c;
//    }
//
//    public int multiply(int a, int b, int c) {
//        return sum(a, b, c) * sub(a, b, c);
//    }
//
//    public float divide(int a, int b, int c) {
//        return sum(a, b, c) / 10f;
//    }

    //--------------------------------------------------------------------------------------

    public long current(long number) {
        return number;
    }

    public long next(long number) {
        return ++number;
    }

    public long prev(long number) {
        return --number;
    }

    public static void main(String[] args) {
//        short shouldBeIncreased = 5;
//        shouldBeIncreased++;
//        shouldBeIncreased--;
//        System.out.println(shouldBeIncreased);

        MarsCalculator marsCalculator = new MarsCalculator();

        System.out.println(marsCalculator.current(5));
        System.out.println(marsCalculator.next(5));
        System.out.println(marsCalculator.prev(5));




    }
}
