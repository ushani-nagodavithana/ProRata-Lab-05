import java.util.Scanner;

public class IT23667082Lab5Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = input.nextInt();

        System.out.print("Enter the third integer: ");
        int num3 = input.nextInt();


	//Math.min(num2, num3) finds the smaller of the second and third numbers. Then Math.min(num1, ...) compares that result with the first number. final result is the smallest of all three//
        int smallest = Math.min(num1, Math.min(num2, num3));


	//Same logic, but uses Math.max to find the largest number//
        int largest = Math.max(num1, Math.max(num2, num3));

	
	//\n adds a blank line before printing//
        System.out.println("\nUser entered numbers are : " + num1 + " " + num2 + " " + num3);
        System.out.println("The Smallest number is: " + smallest);
        System.out.println("The Largest number is: " + largest);

        input.close();
    }
}