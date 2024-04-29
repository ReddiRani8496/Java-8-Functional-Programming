public class GreetingMsgFunctionAsReturnType {
    public static void main(String[] args) {

        NoArgFunction<NoArgFunction<String>> greetMessage = () -> () -> "Hello, welcome";

        NoArgFunction<String> greet = greetMessage.apply();

        System.out.println(greet.apply());
    }

}

@FunctionalInterface
interface NoArgFunction<String> {
    String apply();
}

