import java.util.Scanner;

public class InternetServiceProvider
{
    public static void main(String[] args)
    {
        char selectPackage;
        String input;
        double totalCharge = 0.0;
        double hours, tempCharge , totalSave;

        final double PACK_A = 9.95;
        final double PACK_B = 13.95;
        final double PACK_C = 19.95;
        final double PACK_A_HRS = 10.0;
        final double PACK_B_HRS = 20.0;


        // create the Scanner Object
        Scanner keyboard = new Scanner(System.in);

        // Ask the user for the input package
        System.out.print("Enter your package (A,B, or C): ");
        input = keyboard.nextLine();
        selectPackage = input.charAt(0);

        // Check the input package is valid and get the number of hours
        if (selectPackage < 'A' || selectPackage > 'C')
        {
            System.out.println("Invalid package. Please enter A, B, or C");
        }
        else
        {
            System.out.print("Enter the number of hours that you used: ");
            hours = keyboard.nextDouble();

            // Determine the bill charge
            switch (selectPackage)
            {
                case 'A':
                    totalCharge = PACK_A;
                    if (hours > PACK_A_HRS)
                        totalCharge += (hours - PACK_A_HRS) * 2.0;
                    break;
                case 'B':
                    totalCharge = PACK_B;
                    if (hours > PACK_B_HRS)
                        totalCharge += (hours - PACK_B_HRS);
                    break;
                case 'C':
                    totalCharge = PACK_C;
            }
            // Display the result
            System.out.println("\n--------------------------------------");
            System.out.printf("The total charge for the current package is $%.2f.", totalCharge);
            System.out.println("\n--------------------------------------\n");

            // Calculate and Display the Savings
            switch (selectPackage)
            {
                case 'A':
                    tempCharge = PACK_B;
                    if (hours > PACK_B_HRS)
                    {
                        tempCharge += (hours-PACK_B_HRS);
                    }
                    // Calculate Saving
                    totalSave = totalCharge - tempCharge;

                    // Display the saving charge if the customer select package B
                    System.out.println("\n--------------------------------------");
                    System.out.printf("The total saving if you select package B is $%.2f.", totalSave);
                    System.out.println("\n--------------------------------------\n");

                case 'B':
                    tempCharge = PACK_C;
                    tempCharge += (hours-PACK_C);
                    // Calculate Saving
                    totalSave = totalCharge - tempCharge;

                    // Display the saving charge if the customer select package C
                    System.out.println("\n--------------------------------------");
                    System.out.printf("The total saving if you select package C is $%.2f.", totalSave);
                    System.out.println("\n--------------------------------------\n");
            }


        }

    }
}