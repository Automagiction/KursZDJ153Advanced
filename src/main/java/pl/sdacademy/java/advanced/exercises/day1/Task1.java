package pl.sdacademy.java.advanced.exercises.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Task1 {

    public static final List<String> UNSROTED_LIST = List.of("A", "B", "Z", "D", "G", "C");

    public static void main(String[] args) {
        List<String> stringList = sorting(UNSROTED_LIST);
        List<String> stringList2 = sortingUsingOwnComparator(UNSROTED_LIST);
        List<String> stringList3 = sortingUsingExisitingComparator(UNSROTED_LIST);
        List<String> stringList4 = sortUsingList(UNSROTED_LIST);
        List<String> stringList5 = sortUsingStream(UNSROTED_LIST);

        System.out.println(stringList);
        System.out.println("====METHOD 2====");
        System.out.println(stringList2);
        System.out.println("====METHOD 3====");
        System.out.println(stringList3);
        System.out.println("====METHOD 4====");
        System.out.println(stringList4);
        System.out.println("====METHOD 5====");
        System.out.println(stringList5);

    }
    private static List<String> sorting (List<String> inputStringList) {
        List<String> sorted = new ArrayList<>(inputStringList);
        Collections.sort(sorted, new Comparator<String>() {
            /*
            A.compareTo(B)
            0 -> gdy A i B są takie same
            -1 -> gdy A < B
            +1 -> gdy A > B
             */
//            o1.compareTo(o2); // A -> Z,
//            o2.comapreTo(o1); // Z -> A,
//            -o1.comapreTo(o2) // Z -> A
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        return sorted;
    }
    private static List<String> sortingUsingOwnComparator(List<String> unsorted) {
        List<String> sorted = new ArrayList<>(unsorted);
        Collections.sort(sorted, new MyOwnComparator());
        return sorted;
    }
    private static List<String> sortingUsingExisitingComparator (List<String> unsorted) {
        List<String> sorted = new ArrayList<>(unsorted);
        //Collections.sort(sorted, (s1, s2) -> s2.compareTo(s1));   using Lambda
        Collections.sort(sorted, Comparator.reverseOrder());
        return sorted;
    }
    private static List<String> sortUsingStream (List<String> unsorted){
        List<String> sorted = new ArrayList<>(unsorted);
        return sorted.stream()
                .sorted(Comparator.reverseOrder())
                .toList();
    }
    private static List<String> sortUsingList (List<String> unsorted){
        List<String> sorted = new ArrayList<>(unsorted);
        sorted.sort(Comparator.reverseOrder());
        return sorted;
    }
}
