public class UserDefinedFunctionAsArgument {
    public static void main(String[] args) {

        Student<String,Integer> student = new Student<String,Integer>() {

            @Override
            public String name() {
                return "Rahul";
            }

            @Override
            public Integer age() {
                return 20;
            }
        };

        studentDetails(student);

    }

    private static void studentDetails(Student<String,Integer> student) {
        System.out.println("Name of the student is " + student.name());
        System.out.println("Age of the student is " + student.age());
    }
}

interface Student<T,U> {
    T name();
    U age();
}