package Opg_2_23;

import java.util.Scanner;

public class Opg_2_23 {

    public static void main(String[] args) {

        //Opg 2.23

        //Creating scanner objekt
        Scanner input = new Scanner(System.in);


        //Prompt user to insert value
        System.out.print("Enter the driving distance:");
        double miles = input.nextDouble();

        System.out.print("Enter miles pr gallon:");
        double milesPrGalon = input.nextDouble();

        System.out.print("Enter price pr gallon:");
        double gallonPrice = input.nextDouble();


        //Compute cost of the trip
        double tripCost = (miles / milesPrGalon) * gallonPrice;

        //Result
        System.out.println("The cost of driving is: " + tripCost);




    }
}
