package pl.sdacademy.java.advanced.exercises.day1.Homework.Task2;

import java.util.*;

public class Task2 {
    public static final List<String> UNSROTED_LIST = List.of("A", "B", "Z", "D", "G", "C","z","g","b","a","j");

    public static void main(String[] args) {

        System.out.println(sorting(UNSROTED_LIST));
    }
    public static List sorting (List<String> input) {
        List<String> sorted = new ArrayList<>(input);
        Collections.sort(sorted, new ComparatorForTask2());
        return sorted;
    }
}
