package io.codelex.typesandvariables.practice;

public class MoreVariablesAndPrinting {
    public static void main(String[] args) {
        String Name, Eyes, Teeth, Hair;
        int Age, heightInches, weightInLbs;
        double heightInCm, weightInKilos;

        Name = "Zed A. Shaw";
        Age = 35;
        heightInches = 74;  // inches
        weightInLbs = 180; // lbs
        Eyes = "Blue";
        Teeth = "White";
        Hair = "Brown";
        heightInCm = heightInches * 2.54;
        weightInKilos = weightInLbs * 0.453592;

        System.out.println("Let's talk about " + Name + ".");
        System.out.println("He's " + heightInches + " inches tall.");
        System.out.println("He's " + heightInCm + " centimeters tall.");
        System.out.println("He's " + weightInLbs + " pounds heavy.");
        System.out.println("He's " + String.format("%.2f",weightInKilos) + " kilos heavy.");
        System.out.println("Actually, that's not too heavy.");
        System.out.println("He's got " + Eyes + " eyes and " + Hair + " hair.");
        System.out.println("His teeth are usually " + Teeth + " depending on the coffee.");

        System.out.println("If I add " + Age + ", " + heightInches + ", and " + weightInLbs
                + " I get " + (Age + heightInches + weightInLbs) + ".");
    }
}