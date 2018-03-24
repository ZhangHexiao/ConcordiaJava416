public class DisplayableTestApp
{
    public static void main(String args[])
    {
        System.out.println("Welcome to the Displayable Test application\n");

        // create an Employee object
        Displayable e = new Employee(2, "Smith", "John", 50000);

        // display the employee information
        System.out.println(displayMultiple(e, 1));

        System.out.println();

        // create a Product object
        Displayable p = new Product("java", "Murach's Beginning Java", 49.50);

        // display the product information
        System.out.println(displayMultiple(p, 2));
    }

    private static String displayMultiple(Displayable d, int count)
    {
        String text = "";
        for (int i = 0; i < count; i++)
            text += d.getDisplayText();
        return text;
    }
}