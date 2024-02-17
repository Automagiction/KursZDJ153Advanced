package pl.sdacademy.java.advanced.exercises.day3.Task28;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        List<String> stringList = List.of("a", "b", "c", "d", "e", "f", "g");
//        ArrayList<String> inputArrayList = new ArrayList<>();
//        inputArrayList.add(stringList.toString());
//        SkipArrayList skipArrayList = new SkipArrayList(inputArrayList);
//        ArrayList everyNthElement = skipArrayList.getEveryNthElement(2, 3);
//        System.out.println(everyNthElement);

        SkipArrayList<String> skipArrayList = new SkipArrayList<>();
        skipArrayList.addAll(List.of("a","b", "c", "d", "e", "f", "g"));
        List<String> everyNthElement = skipArrayList.getEveryNthElement(2, 3);
        System.out.println(everyNthElement);

        SkipArrayList<Integer> skipArrayList2 = new SkipArrayList<>();
        skipArrayList2.addAll(List.of(1,2,3,4,5,6,7,8,9,10,11));
        List<Integer> everyNthElement2 = skipArrayList2.getEveryNthElement(2, 3);
        System.out.println(everyNthElement2);

    }
}
