package io.codelex.oop.imperialToMetric;

public class TestExercise5 {
    public static void main(String[] args) {
        double value = 10.0;

        double yards = MeasurementConverter.convert(value, ConversionType.METERS_TO_YARDS);
        System.out.println(value + " meters is equal to " + yards + " yards.");

        double meters = MeasurementConverter.convert(value, ConversionType.YARDS_TO_METERS);
        System.out.println(value + " yards is equal to " + meters + " meters.");

        double inches = MeasurementConverter.convert(value, ConversionType.CENTIMETERS_TO_INCHES);
        System.out.println(value + " centimeters is equal to " + inches + " inches.");

        double centimeters = MeasurementConverter.convert(value, ConversionType.INCHES_TO_CENTIMETERS);
        System.out.println(value + " inches is equal to " + centimeters + " centimeters.");

        double miles = MeasurementConverter.convert(value, ConversionType.KILOMETERS_TO_MILES);
        System.out.println(value + " kilometers is equal to " + miles + " miles.");

        double kilometers = MeasurementConverter.convert(value, ConversionType.MILES_TO_KILOMETERS);
        System.out.println(value + " miles is equal to " + kilometers + " kilometers.");
    }
}
