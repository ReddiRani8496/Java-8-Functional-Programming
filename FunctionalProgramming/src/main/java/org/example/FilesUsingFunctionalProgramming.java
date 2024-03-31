package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesUsingFunctionalProgramming {
    public static void main(String[] args) throws IOException {
        Files.lines(Paths.get("rock.txt")).forEach(System.out::println);
    }
}
