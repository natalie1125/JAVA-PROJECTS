import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat;

public class MachineSolution
{
    public static void main(String[] args)
    {
        // Decide the maximum of random number
        final int MAX_RAND = 5;

        // Declare variables
        double amountBet = 0;
        double amountWon = 0;
        double totalBet = 0;
        double totalWon = 0;
        int randNum;
        char rand1, rand2, rand3;
        char playAgain;
        String input;
        String randList;

        // Create a Scanner Object for they keyboard input
        Scanner keyboard = new Scanner(System.in);

        // create a DecimalFormat Object
        DecimalFormat dollar = new DecimalFormat("#,##0.00");

        // Create a random number object
        Random randNumbers = new Random(MAX_RAND);

        do
        {
            // Get the amount that user want to bet
            System.out.print("Enter the amount you want to bet: $");
            amountBet = keyboard.nextDouble();

            // Calculate the total bet
            totalBet += amountBet;

            // Get 3 words from the list
            for (int i=0; i<3; i++ )
            {
                randNum = randNumbers.nextInt();
                switch (randNum)
                {
                    case 0: System.out.print(" Cherries ");
                            break;
                    case 1: System.out.print(" Oranges ");
                            break;
                    case 2: System.out.print(" Plums ");
                            break;
                    case 3: System.out.print(" Bells ");
                            break;
                    case 4: System.out.print(" Melons ");
                            break;
                    case 5: System.out.print(" Bars ");
                            break;
                }

                // Add the random number to the string of characters
                randList += randNum;
            }
            // Store characters from the list
            rand1 = randList.charAt(0);
            rand2 = randList.charAt(1);
            rand3 = randList.charAt(2);

            // determine if all three characters match
            if (rand1 == rand2 && rand2==rand3)
            {
                System.out.println("\nCongratulation! You got all three matches!");
                amountWon = amountBet*3;
            }
            else if (rand1==rand2 || rand1==rand3 || rand2==rand3)
            {
                System.out.println("\nYou got two matches.");
                amountWon = amountBet*2;
            }
            else
            {
                System.out.println("\nsorry! You don't have any match.");
                amountWon = amountBet *0;
            }

             // Display the amount won
            System.out.println("\nYou won $" + dollar.format(amountWon));

            // Display the total won:
            totalWon += amountWon;

            // Ask the user if they want to play again
            System.out.println("Do you want to play again? ");
            System.out.print("Enter your answer with Y is yes and N is no: ");
            input = keyboard.nextLine();
            playAgain = input.charAt(0);
        } while (playAgain == 'Y' || playAgain == 'y');

        // Display the results
        System.out.println("You bet a total of $" + dollar.format(totalBet));
        System.out.println("You won a total of $" + dollar.format(totalWon));
    }
}
