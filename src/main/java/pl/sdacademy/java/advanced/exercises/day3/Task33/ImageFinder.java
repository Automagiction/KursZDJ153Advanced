package pl.sdacademy.java.advanced.exercises.day3.Task33;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.function.Predicate;

public class ImageFinder {
    public static List<String> findImages (Path directoryPath) throws IOException {
       return Files.walk(directoryPath)     // zwraca listę wszystkich sciezek plikow w danym katalogu (wyciaga rowniez z pod katalogow tam sie znajdujacych)
                .map(Path::toFile)
                .filter(isImage())
                .map(File::getName)
                .toList();
    }

    private static Predicate<File> isImage() {
        return file -> file.getName().endsWith(".png") || file.getName().endsWith(".jpg");
    }
}
