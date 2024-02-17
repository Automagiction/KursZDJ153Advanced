package pl.sdacademy.java.advanced.exercises.day3.Task32;

import pl.sdacademy.java.advanced.exercises.day2.Task12_13.EngineType;


import java.io.*;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;

public class Task32 {
    public static void main(String[] args) {
        Path dirPath = Path.of("src/main/java/pl/sdacademy/java/advanced/exercises/day3/Task32");
        Path file = dirPath.resolve("cars.txt");

        //Tworzymy listę samochodów do zapisu
        Car2 car = new Car2("Volvo", "XC90", 400_000.0, 2018, EngineType.S6);
        Car2 car2 = new Car2("BMW", "X5", 800_000.0, 2022, EngineType.V12);

        List<Car2> cars = List.of(car,car2);

        //zapis do pliku
        saveFileContent(file, cars);

        //odczyt z pliku
        List<Car2> result = readFileContent(file);
        System.out.println(result);

    }

    private static boolean saveFileContent (Path filepath, List<Car2> content) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filepath.toFile()));) {
            oos.writeObject(content);
            return true;
        } catch (IOException e) {
            System.out.println("Exception during I/O: " + e);
        }
        return false;
    }

    private static List<Car2> readFileContent(Path filepath) {
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filepath.toFile()))) {
            return (List<Car2>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error during read I/O: " + e);;
        }
        return Collections.emptyList();
    }
}
