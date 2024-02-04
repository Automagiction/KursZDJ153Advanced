package pl.sdacademy.java.advanced.exercises.day2.Task22;

public class Main {
    public static void main(String[] args) {
        Cube cube = new Cube(3);

        System.out.println("Cube perimeter: " + cube.calculatePerimeter());
        System.out.println("Cube area: " + cube.calculateArea());
        System.out.println("Cube volume: " + cube.calculateVolume());

        cube.fill(8);
        System.out.println(cube.fill(29));

    }
}
