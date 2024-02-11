package pl.sdacademy.java.advanced.exercises.day2.Task22;


public class Cube extends Shape3D implements Fillable{
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


    /**
     *
     * @param fill - ilość wlanej wody
     * @return
     * +1 - wypełniono poza możliwą objętość
     * 0 - wypełniono do pełna
     * -1 - wypełniono w zakresie objętości
     */

    @Override
    public int fill(double fill) {
        double maxVolume = calculateVolume();

        if (fill> maxVolume){
            System.out.println("Kostka przelana");
            return 1;
        } else if (fill< maxVolume){
            System.out.println("Kostka nie napałniona do końca");
            return -1;
        } else {
            System.out.println("Kostka wypełniona");
            return 0;
        }
    }
}
