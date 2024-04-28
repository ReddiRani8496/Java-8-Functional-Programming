    
    import java.util.function.Supplier;
    
    public class FunctionAsData {
        public static void main(String[] args) {
            DataLoading dataLoading = new DataLoading(true);
            Supplier<Person> person = dataLoading.data;
            person.get();
        }
    }
    
    class Person {
        String name;
        int age;
        Person(String name, int age) {
            this.name = name;
            this.age = age;
            System.out.println(name + " " + age);
        }
    }
    
    class DataLoading {
        boolean isDevelopment;
        Supplier<Person> data;
    
        DataLoading(boolean isDevelopment) {
            this.isDevelopment = isDevelopment;
            data = isDevelopment ? DataLoading::fakeData : DataLoading::realData;
        }
    
        static Person fakeData() {
            return new Person("Nick", 25);
        }
    
        static Person realData() {
            return new Person("Rock", 30);
        }
    }
