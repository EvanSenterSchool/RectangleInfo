import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //variables
        double sideOne = 0;
        double sideTwo = 0;
        double rectanglePerimeter;
        double rectangleArea;
        double side_One_Squared;
        double side_Two_Squared;
        double sides_Squared;
        double rectangleDiagonal;
        //boolean false
        boolean firstSide = false;
        boolean secondSide = false;


        //Scanner
        Scanner scan = new Scanner(System.in);


        //gathering user input
        do {
            System.out.println("What is the length of the first side of your rectangle?");
            if (scan.hasNextDouble()) {
                sideOne = scan.nextDouble();
                if (sideOne > 0) {
                    firstSide = true;
                } else {
                    scan.nextLine();
                    System.out.println("you did not enter a valid integer");
                }
            } else {
                scan.nextLine();
                System.out.println("You did not enter a valid data type");
            }

        } while (!firstSide);


        do {
            System.out.println("What is the length of the second side of your rectangle?");
            if (scan.hasNextDouble()) {
                sideTwo = scan.nextDouble();
                if (sideTwo > 0) {
                    secondSide = true;
                } else {
                    scan.nextLine();
                    System.out.println("You did not enter a valid integer");
                }

            } else {
                scan.nextLine();
                System.out.println("You did not enter a valid data type");
            }


        } while (!secondSide);

        // calculations
        rectanglePerimeter = (sideOne * 2) + (sideTwo * 2);
        rectangleArea = sideOne * sideTwo;
        side_One_Squared = sideOne * sideOne;
        side_Two_Squared = sideTwo * sideTwo;
        sides_Squared = side_One_Squared + side_Two_Squared;
        rectangleDiagonal = Math.sqrt(sides_Squared);

        System.out.printf("%-10s %5.2f", "Side 1: ", sideOne);
        System.out.printf("\n%-10s %5.2f", "Side 2: ", sideTwo);
        System.out.printf("\n%-10s %5.2f", "Perimeter: ", rectanglePerimeter);
        System.out.printf("\n%-10s %5.2f", "Area: ", rectangleArea);
        System.out.printf("\n%-10s %5.2f", "Diagonal: ", rectangleDiagonal);
    }
}