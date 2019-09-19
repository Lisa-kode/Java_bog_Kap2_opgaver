import javafx.scene.shape.SVGPath;

import java.util.Scanner;

public class Opg_2_2 {

    public static void main(String[] args) {

        // OPGAVE 2.2

        System.out.println("Opgave 2.2");

        //creating Scanner object
        Scanner input = new Scanner(System.in);

        //Prompt user to insert value
        System.out.println("Enter random length of an equilateral triangle:");
        double triangleLength = input.nextDouble(); //deklarerer typen, som skal promptes

        //Compute triangle area and volume
        double area = ((Math.sqrt(3)/4) * Math.pow(triangleLength, 2));

        double volume = area * triangleLength;

        //Display results
        System.out.println("The area is " + area);
        System.out.println("The volume of the triangular prism is " + volume);


    }
}
