import java.util.Scanner;

public class IT23667082Lab5Q1A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = input.nextInt();

        System.out.print("Enter the third integer: ");
        int num3 = input.nextInt();

        int smallest = num1; //Initially assumes the first number is the smallest//
        int largest = num1; //Initially assumes the first number is the largest//

        //Checks if the second number is smaller than the current smallest//
	if (num2 < smallest) {
            smallest = num2; //If true, updates smallest to num2//
        }

	//Checks if the second number is larger than the current largest//
        if (num2 > largest) {
            largest = num2; //If true, updates largest to num2//
        }

	//Checks if the third number is smaller than the current smallest//
        if (num3 < smallest) {
            smallest = num3; //If true, updates smallest to num3//
        }

	//Checks if the third number is larger than the current largest//
        if (num3 > largest) {
            largest = num3; // If true, updates largest to num3//
        }

        System.out.println("\nUser entered numbers are : " + num1 + " " + num2 + " " + num3);
        System.out.println("The Smallest number is: " + smallest);
        System.out.println("The Largest number is: " + largest);

        input.close();
    }
}