import java.util.Scanner;

public class Opg_2_12 {

    public static void main(String[] args) {

        //Opg 2.12

        // Creating scanner object
        Scanner input = new Scanner(System.in);


        //Prompt user to input
        System.out.println("Enter booth speed and acceleration:"); //information på consol
        double speed = input.nextDouble(); //what must be entered into consol
        double acceleration = input.nextDouble(); //what must be entered into consol
        //NOTE: you can read multiple inputs at a time. You just enter 'input.nextDouble()' at one line at a time!

        
        //Compute runway length
        double runwayLength = (Math.pow( speed, 2) / ( 2 * acceleration)); //formular


        //Result
        System.out.println("The minimum runway length for this airplane is " + runwayLength);



    }
}
