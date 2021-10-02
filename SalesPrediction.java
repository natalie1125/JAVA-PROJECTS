public class SalesPrediction
{
    public static void main(String[] args)
    {
        // Declare the variables
        double saleDivision = 0.62;
        double totalSale = 4.6;
        double eastCoastSale = 0;

        // Calculate the East Coast Sale
        eastCoastSale = totalSale * saleDivision;

        // Display the result
        System.out.println("The East Coast Sale is: $" + eastCoastSale + " million." );

    }
}
