import java.util.Scanner;

    public class Opg_2_1 {

        public static void main(String[] args) {

            //OPGAVE 2.1

            System.out.println("Opgave 2.1");

            //Creating scanner object
            Scanner input = new Scanner(System.in);

            //Prompt user to insert value
            System.out.print("Enter random vaule of miles:");
            double miles = input.nextDouble(); //deklarerer typen, som skal promptes

            //Convert miles into kilometers
            double kilometers = miles * 1.6;

            //Display results
            System.out.println("Result of converting " + miles + " miles into kilometers is " + kilometers + " kilometers");


        }
    }