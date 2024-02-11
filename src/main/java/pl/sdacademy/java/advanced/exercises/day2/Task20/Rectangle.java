package pl.sdacademy.java.advanced.exercises.day2.Task20;

public class Rectangle extends Shape {
    @Override
    double calculateArea() {
        return a*b;
    }

    private final double a;
    private final double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    double calculatePerimeter() {
        return (a*2)+(b*2);
    }

}
