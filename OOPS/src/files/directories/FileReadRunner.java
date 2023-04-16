package files.directories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileReadRunner {

    public static void main(String[] args) throws IOException {

        Path pathFilesToLoad = Paths.get("./resources/data.txt");
//        List<String> lines = Files.readAllLines(pathFilesToLoad);
//        System.out.println(lines);

        Files.lines(pathFilesToLoad)
                .map(String::toLowerCase)
                .forEach(System.out::println);
    }
}
