package pl.sdacademy.java.advanced.exercises.day2.Task21;

public class Main {
    public static void main(String[] args) {
        Shape3D cube = new Cube(3);

        System.out.println("Cube perimeter: " + cube.calculatePerimeter());
        System.out.println("Cube area: " + cube.calculateArea());
        System.out.println("Cube volume: " + cube.calculateVolume());

        Shape cube2 = new Cube(2);
        double cubeVolume = ((Shape3D) cube2).calculateVolume();    //rzutowanie pozwala na uzysaknie dostępu do metody
        double cubePerimeter = cube2.calculatePerimeter();
        System.out.println("Cube volume: " + cubeVolume);
        System.out.println("Cube perimeter: " + cubePerimeter);
    }
}
