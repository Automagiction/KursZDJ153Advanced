package pl.sdacademy.java.advanced.exercises.day2.Task16;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public enum Runner {
    BEGINNER(500, Constants.MAX_VALUE),
    INTERMEDIATE(301, 499),
    ADVANCED(100 , 300);

    private static final Runner[] VALUES = values();
    private final double minTime;
    private final double maxTime;

    Runner(double minTime, double maxTime) {
        this.minTime = minTime;
        this.maxTime = maxTime;
    }
    static Runner getFitnessLevel(double runnerTime) {
//        List<Runner[]> list = Arrays.stream(Runner.values())
//                .filter(runner -> runner.compareTo(runnerTime))
//                .map(runner -> Runner.values())
//                .toList();
//        System.out.println(list);
        return Arrays.stream(VALUES)
                .filter(runner -> runnerTime <= runner.maxTime && runnerTime >= runner.minTime)
                .findFirst()
                //.orElse(BEGINNER);
                .orElseThrow(() -> new IllegalArgumentException("Podany czas jest spoza możliwich zakresów czasu: " + runnerTime));
    }

    private static class Constants {
        public static final int MAX_VALUE = 800;
    }
}
