package com.pluralsight;

public class VariableApp {
    public static void main(String[] args) {
        String myFavouriteColor = "Green";
        short yearStartedProgram = 2026;
        String middleName = " ";
        boolean hasPet = true;
        String niceWords = "Stay Hydrated!";

        System.out.println("My favourite color is: " + myFavouriteColor);
        System.out.println("I started YearUp program in " + yearStartedProgram);
        System.out.println("It is " + hasPet + " that I have a pet.");
        System.out.println(niceWords);

        //Step 2
        byte daysInWeek = 7;
        double priceCoffee = 4.99;
        char myFavouriteLetter = 'Q';
        boolean hasRain = false;

        System.out.println();
        System.out.println("There are " + daysInWeek + " days in a week.");
        System.out.println("The price on coffee is $" + priceCoffee + ".");
        System.out.println("My favourite letter is " + myFavouriteLetter + ".");
        System.out.println("The statement \"rainy outside\" is " + hasRain + ".");
    }
}
