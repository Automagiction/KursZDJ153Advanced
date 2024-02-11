package pl.sdacademy.java.advanced.exercises.day2.Task17;

public class Main {
    public static void main(String[] args) {
        MeasurementConverter converter = new MeasurementConverter();
        double result = converter.convert(2.54, ConversionType.CENTIMETERS_TO_INCHES);
        double result1 = converter.convert(2.54, ConversionTypeWithFunction.CENTIMETERS_TO_INCHES);
        double result2 = converter.convert(30, ConversionTypeWithFunction.KILOMETERS_TO_MILES);
        double result3 = converter.convert(30, ConversionType.KILOMETERS_TO_MILES);

        System.out.println("ConversionType: " + result);
        System.out.println("ConversionTypeWithFunction: " + result1);
        System.out.println("ConversionTypeWithFunction: " + result2);
        System.out.println("ConversionType: " + result3);
    }
}
