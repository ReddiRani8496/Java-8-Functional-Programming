public class Clousres {
    public static void main(String[] args) {

        NumberGenerator<NumberGenerator> number = () -> {
            int num = 10;
            return () -> num + 100;
        };

        // here () -> num + 100; and the variable inside the anonymous class we will get
        // binding the varibales inside the anonymous class and the method is called clousure
        NumberGenerator<Integer> number1 = number.getNumber();

        System.out.println(number1.getNumber()); // it will print 110
    }
}

interface NumberGenerator<T> {
    T getNumber();
}
