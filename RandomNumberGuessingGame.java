import java.util.Random;
import java.util.Scanner;

public class RandomNumberGuessingGame
{
    public static void main(String[] args)
    {
        // create the random Object
        Random randomNumbers = new Random();

        // Create the Scanner object
        Scanner keyboard = new Scanner(System.in);

        // Declare variables
        int guessNum;
        int randNum;
        final int MAX_RAND = 15;
        int count=0;

        // generate random number
        randNum = randomNumbers.nextInt(MAX_RAND);

        // Ask for user's guess
        System.out.print("Guess a number. What's your thinking? ");
        guessNum = keyboard.nextInt();

        // Response the user's guess
        while (guessNum != randNum)
        {
            if(guessNum>randNum)
            {
                System.out.print("Too high. Try again: ");
                guessNum = keyboard.nextInt();
            }
            else
            {
                System.out.print("Too low. Try again: ");
                guessNum = keyboard.nextInt();
            }
            count++;
        }

        // Display the result
        System.out.println("\nCongratulation! You guessed the right number!");
        System.out.println("The right number is " + randNum + " .");
        System.out.println("You guessed the right number after " + count + " times.\n");

    }
}
