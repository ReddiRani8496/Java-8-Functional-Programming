public class UserDefinedBiConsumerInterface {
    public static void main(String[] args) {
        Calculator<Integer,Integer> calc = UserDefinedBiConsumerInterface::add;

        calc.calculate(10,20);
    }

    public static void add(int a, int b) {
        System.out.println(a+b);
    }
    public static void sub(int a, int b) {
        System.out.println(a-b);
    }
    public static void combine2And3(Calculator<Integer,Integer> calc) {
        calc.calculate(2,3);
    }
}

interface Calculator<T,U> {
    void calculate(T a, U b);
}

