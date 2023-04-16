package files.directories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class DirectoryScanRunner {

    public static void main(String[] args) throws IOException {

        // Files.list returns a stream as output
        Path currentDir = Paths.get(".");
        // Files.list(currentDir).forEach(System.out::println);

        // to walk through the current directory
        // Files.walk(currentDir, 4).forEach(System.out::println);

        Predicate<? super Path> predicate = path -> String.valueOf(path).contains(".java");

        // Files.walk(currentDir, 4).filter(predicate).forEach(System.out::println);

        BiPredicate<Path, BasicFileAttributes> matcher = (path, attributes) -> String.valueOf(path).contains(".java");
        // Files.find(currentDir, 4, matcher).forEach(System.out::println);


        BiPredicate<Path, BasicFileAttributes> dirMatcher = (path, attributes) -> attributes.isDirectory();
        Files.find(currentDir, 4, dirMatcher).forEach(System.out::println);


    }
}

