
import java.util.Scanner;
public class SalesTax
{
    public static void main(String[] args)
    {
        // Declare the TAX rates
        final double STATE_TAX_RATE = 0.04;
        final double COUNTRY_TAX_RATE = 0.02;

        // Declare the variables:
        double purchase;
        double stateSaleTax;
        double countrySaleTax;
        double totalSaleTax;
        double totalSale;

        // Ask the user to enter the amount of purchase
        Scanner keyboard = new Scanner (System.in);
        System.out.println("Enter the amount of purchase: ");
        purchase = keyboard.nextDouble();

        // Calculate the results
        stateSaleTax = purchase * STATE_TAX_RATE;
        countrySaleTax = purchase * COUNTRY_TAX_RATE;
        totalSaleTax = stateSaleTax + countrySaleTax;
        totalSale = purchase + totalSaleTax;

        // Display the amount of purchase:
        System.out.println("The amount of purchase is: " + purchase + "\n");

        // Display the state sales tax:
        System.out.println("The state sales tax is : " + stateSaleTax +"\n");

        // Display the country sales tax:
        System.out.println("The country sales tax is: " + countrySaleTax +"\n");

        // Display the total sales tax:
        System.out.println("The total sales tax is: " + totalSaleTax + "\n");

        //Display the total sale
        System.out.println("----------------------------------");
        System.out.println("The total sale is: " + totalSale );
        System.out.println("-------------------------------------");

    }
}
