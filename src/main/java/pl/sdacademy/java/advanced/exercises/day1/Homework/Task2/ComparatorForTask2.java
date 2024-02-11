package pl.sdacademy.java.advanced.exercises.day1.Homework.Task2;

import java.util.Comparator;

public class ComparatorForTask2 implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String k1 = o1.toUpperCase();
        String k2 = o2.toUpperCase();
        return k2.compareTo(k1);
    }
}
