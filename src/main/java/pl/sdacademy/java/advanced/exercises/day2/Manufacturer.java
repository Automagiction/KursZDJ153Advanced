package pl.sdacademy.java.advanced.exercises.day2;

public class Manufacturer {
    private final String name;
    private final int foundedYear;

    private final String country;

    public Manufacturer(String name, int foundedYear, String country) {
        this.name = name;
        this.foundedYear = foundedYear;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Manufacturer{" +
                "name='" + name + '\'' +
                ", foundedYear=" + foundedYear +
                ", country='" + country + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getFoundedYear() {
        return foundedYear;
    }

    public String getCountry() {
        return country;
    }
}
