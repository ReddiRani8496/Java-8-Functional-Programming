public class ProcedureOrientationInJava {
    public static void main(String[] args) {
        int a = 20;
        int b = 30;
        int sum = a+b; // all are premitives, so we are not using objects

        display(); // using procedures calling display method
    }

    private static void display() {
        System.out.println("Procedures..");
    }
}
