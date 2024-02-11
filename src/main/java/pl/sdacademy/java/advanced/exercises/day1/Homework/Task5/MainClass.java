package pl.sdacademy.java.advanced.exercises.day1.Homework.Task5;

import java.util.HashSet;

public class MainClass {
    public static void main(String[] args) {
        HashSet<String> strings = new HashSet<>();
        strings.add("a");
        strings.add("b");
        //strings.add("b");  //brak duplikatów
        strings.add("c");
        strings.add("d");
        strings.remove("d");
        System.out.println(strings.size());

        System.out.println(strings.contains("d"));
        //strings.clear();

        for(String element:strings){
            System.out.println(element);
        }

        System.out.println("============ HASH SET =============");

        SDAHashSet<String> stringSDAHashSet = new SDAHashSet<>();
        stringSDAHashSet.add("a");
        stringSDAHashSet.add("a");
        stringSDAHashSet.add("a");
        stringSDAHashSet.add("b");
        stringSDAHashSet.add("c");
        stringSDAHashSet.add("d");

        stringSDAHashSet.remove("d");
        System.out.println(stringSDAHashSet.size());
        System.out.println(stringSDAHashSet.contains("d"));
        stringSDAHashSet.clear();
        stringSDAHashSet.print();

        System.out.println("=========== INT ==========");
        SDAHashSet<Integer> intSDAHashSet = new SDAHashSet<>();
        intSDAHashSet.add(1);
        intSDAHashSet.add(1);
        intSDAHashSet.add(1);
        intSDAHashSet.add(2);
        intSDAHashSet.add(3);
        intSDAHashSet.add(4);

        intSDAHashSet.remove(4);
        System.out.println(intSDAHashSet.size());
        System.out.println(intSDAHashSet.contains(2));
        //intSDAHashSet.clear();
        intSDAHashSet.print();



    }
}
