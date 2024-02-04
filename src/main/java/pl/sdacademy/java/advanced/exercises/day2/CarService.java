package pl.sdacademy.java.advanced.exercises.day2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class CarService {
    private final List<Car> cars;

    public CarService() {
        cars = new ArrayList<>();
    }

    public boolean add(Car car) {
        return cars.add(car);
    }

    public boolean remove(Car car) {
        return cars.remove(car);
    }

    public List<Car> getAll() {
        // return cars;  zwraca referencję, będziemy operować cały czas na cars (jednej liscie)
        // return List.copyOf(cars); // tworzy i zwraca niemodyfikowalną listę
        return new ArrayList<>(cars);
    }

    public List<Car> getCarsWithV12() {
        return cars.stream()
                .filter(car -> car.getEngineType().equals(EngineType.V12))
                .toList();
    }

    public List<Car> getCarsOlderThan1999() {
        return cars.stream()
                .filter(car -> car.getProductionYear() < 1999)
                .toList();
    }

    //    public void getTheMostExpensiveCar (cars) {
//         cars.stream()
//                .map(car -> {
//                    double price = 0;
//                    if (car.getPrice() > price) {
//                        price = car.getPrice();
//                    }
//                    return price;
//                })
//                .toList();
//        {
//            System.out.println(theMostExpensiveCar);
//        }
//    }
    public Car getCheepestCar() {
        return cars.stream()
                //.min(Comparator.comparingDouble(car -> car.getPrice()))
                .min(Comparator.comparingDouble(Car::getPrice))
                //.orElseThrow(() -> new IllegalArgumentException());
                .orElseThrow(IllegalArgumentException::new);
    }

    //    public Optional<Car> getCheepestCar () {
//        return Optional.of(cars.stream()
//                //.min(Comparator.comparingDouble(car -> car.getPrice()))
//                .min(Comparator.comparingDouble(Car::getPrice))
//                .get());
//
//    }
    public Car getTheMostExpensive() {
        return cars.stream()
                //.min(Comparator.comparingDouble(car -> car.getPrice()))
                .max(Comparator.comparingDouble(Car::getPrice))
                //.orElseThrow(() -> new IllegalArgumentException());
                .orElseThrow(IllegalArgumentException::new);
    }
    public List<Car> getCarsSortedByName(boolean ascending) {
        if(ascending) {
            return cars.stream()
                    .sorted(Comparator.comparing(Car::getName))
                    .toList();
        }
        return cars.stream()
                .sorted(Comparator.comparing(Car::getName).reversed())
                .toList();
    }
}
