package pl.sdacademy.java.advanced.exercises.day1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task3 {
    public static void main(String[] args) {
        Map<String, Integer> input  = new LinkedHashMap<>();
        input.put("Java", 18);
        input.put("Python", 1);
        input.put("C#", 15);
        input.put("JavaScript", 7);
        input.put("Scala", 22);
        input.put("PHP", 0);

        printMap(input);
        System.out.println("=== METHOD 2 ===");
        printWithStream(input);
    }
    private static void printMap (Map<String,Integer> inputMap){
        int counter = 0;
        for(Map.Entry<String, Integer> element : inputMap.entrySet()){
            counter++;
            if (inputMap.size() == counter){
                System.out.println("Klucz: " + element.getKey() + ", Wartość: " + element.getValue() + ".");
            } else {
                System.out.println("Klucz: " + element.getKey() + ", Wartość: " + element.getValue() + ",");
            }
        }
    }
    private static void printWithStream (Map<String,Integer> inputMap){
        String result = inputMap.entrySet().stream()
                .map(element -> "Klucz: " + element.getKey() + ", Wartość: " + element.getValue())
                .collect(Collectors.joining("," + System.lineSeparator(), "", "."));    // zamiast "\n" lepiej użyć System.lineSepartor() - opcja pewniejsza
//                .collect(Collectors.toList()); to samo co niżej, pełna nazwa methody
//                .toList();
        System.out.println(result);
    }
}
