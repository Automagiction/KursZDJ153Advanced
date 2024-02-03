package pl.sdacademy.java.advanced.exercises.day1.Task4;

import java.util.List;
import java.util.Map;

public class MainTask4 {
    public static void main(String[] args) {
        Storage storage = new Storage();
        storage.addToStorage("artykuły spożywcze", "mleko");
        storage.addToStorage("artykuły spożywcze", "cukier");
        storage.addToStorage("samochody", "fiat");
        storage.addToStorage("samochody", "volvo");
        storage.addToStorage("samochody", "mercedes");
        storage.addToStorage("różne", "mleko");
        storage.addToStorage("różne", "volvo");
        //Map<String, List<String>> storage1 = storage.getStorage();

        storage.printValues("artykuły spożywcze");
        storage.printValues("samochody");
        storage.printValues("różne");

        System.out.println("==== WYPISZ KLUCZE ZAWIERAJĄCE WARTOŚĆ 'volvo' ====");

        List<String> volvo = storage.findKeysByValue("volvo");
        System.out.println(volvo);
    }
}
