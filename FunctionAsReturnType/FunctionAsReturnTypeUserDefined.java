import java.util.function.Function;

public class FunctionAsReturnTypeUserDefined {

    private static int timesTwo(int value) {
        return value * 2;
    }

    private static int timesThree(int value) {
        return value * 3;
    }
    private static int timesFour(int value) {
        return value * 4;
    }

    // instead of writing all the redundant methods we can simplify by returning function

    private static Function<Integer, Integer> createMultiplier(int value) {
        return (times) -> value * times;
    }

    public static void main(String[] args) {

//        System.out.println(timesTwo(5));
//        System.out.println(timesThree(5));
//        System.out.println(timesFour(5));

        // create multiplier returns : (times)-> 2 * times
        // so it is replaced as: Function<Integer,Integer> timesTwo = (times)->2*times;
        // when we call using apply method, the value in apply method is replaced with times
        Function<Integer, Integer> timesTwo = createMultiplier(2);
        Function<Integer, Integer> timesThree = createMultiplier(3);
        Function<Integer, Integer> timesFour = createMultiplier(4);
        System.out.println(timesTwo.apply(5));
        System.out.println(timesThree.apply(5));
        System.out.println(timesFour.apply(5));
    }

}
