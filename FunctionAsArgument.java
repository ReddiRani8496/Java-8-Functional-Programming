import java.util.function.BiFunction;

public class FunctionAsArgument {
    static int balance = 10000;
    static int bonus = 500;

    public static void main(String[] args) {
        //int finalAmount = increase((balance,bonus) -> balance+bonus);

      //  int finalAmount = increase(FunctionAsArgument::increaseBy10Percent);

        int finalAmount = increase(FunctionAsArgument::increaseBy20Percent);
        System.out.println(finalAmount);
    }

    static int increaseBy10Percent(int balance,int bonus) {
        return ((balance+bonus)/100)*110;
    }

    static int increaseBy20Percent(int balance,int bonus) {
        return ((balance+bonus)/100)*120;
    }

    static int increase(BiFunction<Integer,Integer,Integer>  inc) {
        return inc.apply(balance,bonus);
    }
}
