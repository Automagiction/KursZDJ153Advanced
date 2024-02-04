package pl.sdacademy.java.advanced.exercises.day2.Task20;

public class Main {
    public static void main(String[] args) {
        Hexagon hexagon = new Hexagon(3);
        Triangle triangle = new Triangle(2, 3, 4);
        Rectangle rectangle = new Rectangle(2,4);

        System.out.println("Hexagon perimeter: " + hexagon.calculatePerimeter());
        System.out.println("Triangle perimeter: " + triangle.calculatePerimeter());
        System.out.println("Rectangle perimeter: " + rectangle.calculatePerimeter());
    }
}
