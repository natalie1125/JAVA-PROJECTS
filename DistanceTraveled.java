import java.util.Scanner;
import java.io.*;

public class DistanceTraveled
{
    public static void main(String[] args) throws IOException
    {
        int hour;
        double speed;
        int i =1;


        // Create a Scanner object
        Scanner keyboard = new Scanner(System.in);

        // Get the user's speed
        System.out.print("Enter the vehicle's speed: ");
        speed = keyboard.nextDouble();

        // Validate the speed
        while (speed < 0)
        {
            System.out.println("Enter the speed greater than 0: ");
            speed = keyboard.nextDouble();
        }

        // Get the number of hours
        System.out.print("Enter the number of hour for the vehicle: ");
        hour = keyboard.nextInt();

        //Validate the hour
        while (hour<1)
        {
            System.out.print("Enter the hour greater than 1: ");
            hour = keyboard.nextInt();
        }

        // Open the output file
        FileWriter fw = new FileWriter("Distance.txt");
        PrintWriter outFile = new PrintWriter(fw);


        // Display the result
        outFile.println("Hour\t\tDistance Traveled");
        outFile.println("----------------------------");


        while(i<=hour)
        {
            outFile.println(i + "\t\t\t\t" + i * speed);
            i++;
        }

        // Close the file
        outFile.close();

    }
}
