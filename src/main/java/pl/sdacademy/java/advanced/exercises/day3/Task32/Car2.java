package pl.sdacademy.java.advanced.exercises.day3.Task32;

import pl.sdacademy.java.advanced.exercises.day2.Task12_13.EngineType;
import pl.sdacademy.java.advanced.exercises.day2.Task12_13.Manufacturer;

import java.io.Serializable;
import java.util.List;

public class Car2 implements Serializable {
    static final long serialVersionUID = 1L;
    private final String name;
    private final String model;
    private final double price;
    private final int productionYear;
    private final EngineType engineType;

    public Car2(String name, String model, double price, int productionYear, EngineType engineType) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.productionYear = productionYear;
        this.engineType = engineType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", productionYear=" + productionYear +
                ", engineType=" + engineType +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public EngineType getEngineType() {
        return engineType;
    }
}
