package pl.sdacademy.java.advanced.exercises.day2;

import java.util.List;

public class MainTask12_13 {
    public static void main(String[] args) {
        Manufacturer volvo = new Manufacturer("Volvo",1990,"Sweden");
        Car xc90 = new Car("Volvo", "XC90", 400_000, 2023, List.of(volvo), EngineType.V12);
        Car xc60 = new Car("Volvo", "XC60", 200_000, 2022, List.of(volvo), EngineType.V8);
        Car xc40 = new Car("Volvo", "XC40", 150_000, 2021, List.of(volvo), EngineType.V6);
        Car xc30 = new Car("Volvo", "XC30", 70_000, 1998, List.of(volvo), EngineType.S3);
        Car xc20 = new Car("Volvo", "XC20", 20_000, 1995, List.of(volvo), EngineType.S4);

        //główna wypożyczalnia
        CarService mainCarRental = new CarService();
        mainCarRental.add(xc90);
        mainCarRental.add(xc60);
        mainCarRental.add(xc30);
        mainCarRental.add(xc20);
        //mainCarRental.remove(xc90);
        //klient_1
        List<Car> carRental_1 = mainCarRental.getAll();
        carRental_1.add(xc40);
        carRental_1.remove(xc90);
        System.out.println();

        System.out.println(mainCarRental.getCarsWithV12());
        System.out.println(mainCarRental.getCarsOlderThan1999());
        System.out.println(mainCarRental.getCheepestCar());
        System.out.println("Ascending: " + mainCarRental.getCarsSortedByName(true));
        System.out.println("Descending: " + mainCarRental.getCarsSortedByName(false));

    }
}
