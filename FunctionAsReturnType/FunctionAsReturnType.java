import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionAsReturnType {
    public static void main(String[] args) {

//        Supplier<Supplier<Integer>> supplier = ()-> () -> 50;
//        System.out.println(supplier.get().get());

            // storing each obj return
//        Supplier<Supplier<String>> supplier = ()->()->"I am supplier";
//        Supplier<String> supplier1 = supplier.get(); // returns ()->"I am supplier"
//        System.out.println(supplier1.get()); // prints "I am supplier"

        // using supplier and predicate finding number is even or not

//        Supplier<Supplier<Predicate<Integer>>> isEven = () -> () -> (num) -> num % 2 == 0;
//        Supplier<Predicate<Integer>> isEven1 = isEven.get();
//        Predicate<Integer> isEven2 = isEven1.get();
//        System.out.println(isEven2.test(50));

        // declaring in multiple lines

        Predicate<Integer> isEvenPredicate = (num) -> num % 2 == 0;
        Supplier<Predicate<Integer>> isEvenSupplier =()-> isEvenPredicate;
        Supplier<Supplier<Predicate<Integer>>> isEvenSupplierSupplier = () -> isEvenSupplier;
        boolean isEven = isEvenSupplierSupplier.get().get().test(50);
        System.out.println(isEven);


    }
}

