package pl.sdacademy.java.advanced.exercises.day2.Task20;

public class Hexagon extends Shape{
    private final double a;

    public Hexagon(double a) {
        this.a = a;
    }

    @Override
    double calculatePerimeter() {
        return a*6;
    }

    @Override
    double calculateArea() {
        return 0; //dodać
    }
}
