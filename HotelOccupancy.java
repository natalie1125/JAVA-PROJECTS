import java.util.Scanner;


public class HotelOccupancy
{
    public static void main(String[] args)
    {
        int numFloor, numRoom, numOcc, vacantRooms;
        int totalRooms = 0;
        int totalOcc = 0;
        double occRate;

        // Create the Object for Scanner
        Scanner keyboard = new Scanner(System.in);

        // Ask for number of Floors
        System.out.print("How many number of floors does the hotel have? ");
        numFloor = keyboard.nextInt();

        // Validate the number of floor
        while (numFloor<1)
        {
             System.out.print("Please enter the number of floor greater than 1: ");
             numFloor = keyboard.nextInt();
        }

        // Declare number of rooms and number of occupied on each floor
        for (int i=0; i<numFloor; i++)
        {
            // get input for number of rooms on each floor
            System.out.print("How many rooms on floor " + (i+1) + " have? ");
            numRoom = keyboard.nextInt();

            // validate the number of room
            while (numRoom<10)
            {
                System.out.print("Invalid. Please enter the number of rooms greater than 10: ");
                numRoom = keyboard.nextInt();
            }

            // calculate the total of rooms on each floor
            totalRooms += numRoom;

            // get input for number of occupied rooms on each floor
            System.out.print("How many occupied rooms on the floor " + (i+1) + " have? ");
            numOcc = keyboard.nextInt();

            // validate number of occupied rooms
            while (numOcc>numRoom)
            {
                System.out.print("Invalid. The number of occupied rooms should be less than " + numRoom + ". Please re-enter: ");
                numOcc = keyboard.nextInt();
            }

            // Calculate the total of occupied rooms:
            totalOcc += numOcc;
        }

        // Calculate the number of vacant rooms:
        vacantRooms = totalRooms - totalOcc;

        // Calculate the occupancy rate:
        occRate = (double)totalOcc / totalRooms;

        // Display the reuslts
        System.out.println("\n\nThe total of rooms are: " + totalRooms);
        System.out.println("The total of occupied rooms are: " + totalOcc);
        System.out.println("The total of vacant rooms are: " + vacantRooms);
        System.out.printf("The Occupancy Rate is %.3f. : ", occRate);
        System.out.println();




    }
}
