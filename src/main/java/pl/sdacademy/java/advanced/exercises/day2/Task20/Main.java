package pl.sdacademy.java.advanced.exercises.day2.Task20;

public class Main {
    public static void main(String[] args) {
        Shape hexagon = new Hexagon(3);
        Shape triangle = new Triangle(2, 3, 4);
        Shape rectangle = new Rectangle(2,4);

        System.out.println("Hexagon perimeter: " + hexagon.calculatePerimeter());
        System.out.println("Triangle perimeter: " + triangle.calculatePerimeter());
        System.out.println("Rectangle perimeter: " + rectangle.calculatePerimeter());
    }
}
