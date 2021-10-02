public class NameInitial
{
    public static void main(String[] args)
    {
        // Declare String variables
        String firstName = "Natalie";
        String middleName = "N";
        String lastName = "Nguyen";

        // Declare char variables
        char firstInitial = firstName.charAt(0);
        char middleInitial = middleName.charAt(0);
        char lastInitial = lastName.charAt(0);

        // Display the full name
        System.out.println("My first name is : " + firstName);
        System.out.println("My middle name is : " + middleName);
        System.out.println("My last name is : " + lastName);

        // Display the initial:
        System.out.println("----------------------------------");
        System.out.println("My first name initial is : " + firstInitial);
        System.out.println("My middle name initial is : " + middleInitial);
        System.out.println("My last name initial is : " + lastInitial);

    }
}
