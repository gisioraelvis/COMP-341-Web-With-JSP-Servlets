package utils;

import java.io.FileWriter;
import java.io.IOException;

import java.nio.file.Files;
import java.nio.file.Path;

public class IO {

    public static String readFile(String path) throws IOException {

        Path fileName = Path.of(path);
        // System.out.println(Files.readString(fileName));
        return Files.readString(fileName).trim();
    }

    ;

    public static void saveToFile(String json, String path) throws IOException {
        FileWriter writer = new FileWriter(path, false);
        writer.write(json);
        writer.close();
    }
}
