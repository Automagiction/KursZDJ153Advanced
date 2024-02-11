package pl.sdacademy.java.advanced.exercises.day1.Homework.Task6;

import com.sun.jdi.Value;

import java.security.Key;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

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
