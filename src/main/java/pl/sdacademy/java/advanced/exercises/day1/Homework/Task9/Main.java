package pl.sdacademy.java.advanced.exercises.day1.Homework.Task9;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Point2D center = new Point2D(8, -8);
        Point2D point = new Point2D(-2, -2);
        Circle circle = new Circle(center, point);

        System.out.println("Radius is: " + circle.getRadius());
        System.out.println("Perimeter is: " + circle.getPerimeter());
        System.out.println("Area is: " + circle.getArea());
        Map<String, Point2D> slicePoints = circle.getSlicePoints();
        System.out.println("Slice points: " + slicePoints.entrySet());

    }
}
