package pl.sdacademy.java.advanced.exercises.day2.Task21;


public class Cube extends Shape3D{
    private final double a;

    public Cube(double a) {
        this.a = a;
    }

    @Override
    double calculatePerimeter() {
        return a*12;
    }

    @Override
    double calculateArea() {
        return Math.pow(a,2)*6;
    }

    @Override
    double calculateVolume() {
        return Math.pow(a,3);
    }
}
