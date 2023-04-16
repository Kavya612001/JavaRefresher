package files.directories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class FileWritterRunner {

    public static void main(String[] args) throws IOException {

        Path pathFileToLoad = Paths.get("./resources/data-write.txt");
        List<String> write = Arrays.asList("Sampath", "Latha", "Kavya");
        Files.write(pathFileToLoad, write);

    }
}
