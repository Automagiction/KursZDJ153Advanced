package pl.sdacademy.java.advanced.exercises.day2.Task16;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Runner fitnesLevel = Runner.getFitnessLevel(500);
        System.out.println(fitnesLevel);
        Runner fitnesLevel2 = Runner.getFitnessLevel(301);
        System.out.println(fitnesLevel2);
        Runner fitnesLevel3 = Runner.getFitnessLevel(499);
        System.out.println(fitnesLevel3);
        Runner fitnesLevel4 = Runner.getFitnessLevel(300);
        System.out.println(fitnesLevel4);
        Runner fitnesLevel5 = Runner.getFitnessLevel(800);
        System.out.println(fitnesLevel5);


    }
}
