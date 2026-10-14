import java.util.Scanner;

public class IT23667082Lab5Q3 {
    public static void main(String[] args) {

	//Declares a constant for the room charge per day. Final means the value cannot be changed later//

        final double ROOM_CHARGE = 48000.0;
        final double DISCOUNT_10 = 0.10;
        final double DISCOUNT_20 = 0.20;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Start Date (1-31): ");
        int startDate = input.nextInt();

        System.out.print("Enter End Date (1-31): ");
        int endDate = input.nextInt();

        // Validation 1//
	//Checks that both dates are between 1 and 31 inclusive. OR – if any condition is true, the input is invalid//
        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Error: Days must be between 1 and 31");
            return;
        }


        // Validation 2
	//Start date must be strictly less than end date//
        if (startDate >= endDate) {
            System.out.println("Error: Start Date must be less than End Date");
            return;
        }

        int daysReserved = endDate - startDate;
        double totalAmount;

	/*double original = daysReserved * ROOM_CHARGE;
	double discountAmount = original * DISCOUNT_20;
	totalAmount = original - discountAmount;

	This is equivalent to:
	totalAmount = daysReserved * ROOM_CHARGE * (1 - DISCOUNT_20);*/


        if (daysReserved >= 5) {
            totalAmount = daysReserved * ROOM_CHARGE * (1 - DISCOUNT_20);
        } else if (daysReserved >= 3) {
            totalAmount = daysReserved * ROOM_CHARGE * (1 - DISCOUNT_10);
        } else {
            totalAmount = daysReserved * ROOM_CHARGE;
        }

        System.out.println("\nRoom Charge Per Day: Rs. " + ROOM_CHARGE + "/=");
        System.out.println("Number of Days Reserved: " + daysReserved);
        System.out.println("Total Amount to be Paid: " + totalAmount);

        input.close();
    }
}