package pl.sdacademy.java.advanced.exercises.day1.Homework;

import java.util.TreeMap;

public class Task6 {
    public static void main(String[] args) {
        TreeMap<Integer, String> integerStringTreeMap = new TreeMap<>();
        integerStringTreeMap.put(1,"a");
        integerStringTreeMap.put(2,"b");
        integerStringTreeMap.put(3,"c");
        TreeMap<String, Integer> stringIntegerTreeMap = new TreeMap<>();
        stringIntegerTreeMap.put("first",10);
        stringIntegerTreeMap.put("second",20);
        stringIntegerTreeMap.put("third",30);

        printFirstAndLastEntrySet(integerStringTreeMap);
        printFirstAndLastEntrySet(stringIntegerTreeMap);

    }
    public static <K, V> void printFirstAndLastEntrySet (TreeMap <K, V> input) {
        System.out.println("First Entry: " + input.firstEntry());
        System.out.println("Last Entry: " + input.lastEntry());
    }

}
