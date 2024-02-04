package pl.sdacademy.java.advanced.exercises.day2;

import java.util.List;

public class Car {
    private final String name;
    private final String model;
    private final double price;
    private final int productionYear;
    private final List<Manufacturer> manufacturers;
    private final EngineType engineType;

    public Car(String name, String model, double price, int productionYear, List<Manufacturer> manufacturers, EngineType engineType) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.productionYear = productionYear;
        this.manufacturers = manufacturers;
        this.engineType = engineType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", productionYear=" + productionYear +
                ", manufacturers=" + manufacturers +
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

    public List<Manufacturer> getManufacturers() {
        return manufacturers;
    }

    public EngineType getEngineType() {
        return engineType;
    }
}
