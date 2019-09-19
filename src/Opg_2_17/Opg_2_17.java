package Opg_2_17;

import java.util.Scanner;

public class Opg_2_17 {

    public static void main(String[] args) {

        // Opgave 2.17

        System.out.println("Opg 2.17");

        //Creating  scanner objetct
        Scanner input = new Scanner(System.in);


        //Prompt user to insert value
        System.out.println("Enter temperature in Fahrenheit between -58 and 41 F.:");
        double fahrenheit = input.nextDouble();
        while (fahrenheit < -59 || fahrenheit > 41) {   //dette er en loop, som gentages indtil input er korrekt.
            System.out.println("Wrong input, try again");
            fahrenheit = input.nextDouble();
        }

        System.out.println("Enter wind speed (> = 2) in miles pr hour:");
        double windSpeed = input.nextDouble();
        while (windSpeed < 1) {
            System.out.println("Wrong input, value must be (> = 2)");
            fahrenheit = input.nextDouble();
        }

        //Compute wind-chill temperature
        double windChillTemperature = (35.74 + 0.6215 * fahrenheit - 35.75 * Math.pow(windSpeed, 0.16) + 0.4275 * fahrenheit * Math.pow(windSpeed,0.16));

        //Result
        System.out.println("The wind chill index is " + windChillTemperature);

    }

}
