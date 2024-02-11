package pl.sdacademy.java.advanced.exercises.day2.Task20;

public class Triangle extends Shape{
    private final double a;
    private final double b;
    private final double h;

    public Triangle(double a, double b, double h) {
        this.a = a;
        this.b = b;
        this.h = h;
    }

    @Override
    double calculatePerimeter() {
        return (2*a)+b;
    }

    @Override
    double calculateArea() {
        return ((a/2)*h);
    }
}
