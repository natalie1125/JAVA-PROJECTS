import java.util.Scanner;
import java.text.DecimalFormat;


public class BudgetAnalysis
{
    public static void main(String[] args)
    {
        // Declare variables
        double budget;
        double expense;
        double diffBudget;
        double totalExpense = 0.0;

        // Create a Scanner Object
        Scanner keyboard = new Scanner(System.in);

        // Create a DecimalFormat Object
        DecimalFormat dollar = new DecimalFormat("#,###0.00");

        // Get the input budget amount
        System.out.print("Enter your budget amount, or the negative number to quit: ");
        budget = keyboard.nextDouble();

        // Create a Loop to get each expense
        do
        {
            System.out.print("Enter an expense: ");
            expense = keyboard.nextDouble();
            if (expense>0)
            {
                totalExpense += expense;
            }
        } while (expense>=0);

        // Calculate the amount of over or under budget
        diffBudget = budget - totalExpense;

        // Display the amount of over or under budget
        if (diffBudget<0)
        {
            diffBudget = -(diffBudget);
            System.out.println("\nYou are under budget by $" + dollar.format(diffBudget));
        }
        else if (diffBudget>0)
        {
            System.out.println("You are over budget by $" + dollar.format(diffBudget));
        }
        else
        {
            System.out.println("You are spending exactly your budget.\n");
        }
    }
}
