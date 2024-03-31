import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class FilesUsingFunctionalProgramming {
       public static void main(String[] args)  {
        try {
        Files.lines(Paths.get("rock.txt"))
        .map(word -> word.split(" "))
        .flatMap(Arrays::stream)
        .distinct()
        .sorted()
        .forEach(System.out::println);
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
