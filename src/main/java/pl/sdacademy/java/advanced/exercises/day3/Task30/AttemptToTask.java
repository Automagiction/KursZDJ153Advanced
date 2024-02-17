package pl.sdacademy.java.advanced.exercises.day3.Task30;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        // Podaj ścieżkę do pliku, który chcesz odwrócić
        String sciezkaWejsciowegoPliku = "C:\\Users\\arkad\\Desktop\\Task30.txt";

        // Wczytaj zawartość pliku
        String zawartoscPliku = odczytajPlik(sciezkaWejsciowegoPliku);

        // Odwróć zawartość
        String odwroconaZawartosc = odwrocZawartosc(zawartoscPliku);

        // Utwórz nową nazwę pliku (dodaj "_odwrocone" przed rozszerzeniem)
        String nowaNazwaPliku = dodajPrzedRozszerzeniem(sciezkaWejsciowegoPliku, "_odwrocone");

        // Zapisz odwróconą zawartość do nowego pliku
        zapiszPlik(nowaNazwaPliku, odwroconaZawartosc);

        System.out.println("Plik został odwrócony i zapisany jako: " + nowaNazwaPliku);
    }

    private static String odczytajPlik(String sciezka) {
        StringBuilder zawartosc = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(sciezka))) {
            String linia;
            while ((linia = reader.readLine()) != null) {
                zawartosc.append(linia).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return zawartosc.toString();
    }

    private static String odwrocZawartosc(String zawartosc) {
        return new StringBuilder(zawartosc).reverse().toString();
    }

    private static String dodajPrzedRozszerzeniem(String sciezka, String dodatek) {
        int lastDotIndex = sciezka.lastIndexOf(".");
        if (lastDotIndex == -1) {
            return sciezka + dodatek;
        } else {
            return sciezka.substring(0, lastDotIndex) + dodatek + sciezka.substring(lastDotIndex);
        }
    }

    private static void zapiszPlik(String sciezka, String zawartosc) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(sciezka))) {
            writer.write(zawartosc);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
