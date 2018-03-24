import java.text.NumberFormat;

public class Employee implements DepartmentConstants, Displayable
{
    private int department;
    private String firstName;
    private String lastName;
    private double salary;

    public Employee(int department, String lastName, String firstName,
        double salary)
    {
        this.department = department;
        this.lastName = lastName;
        this.firstName = firstName;
        this.salary = salary;
    }

    @Override
    public String getDisplayText()
    {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String text = "";
        text += "Name:\t" + firstName + " " + lastName + "\n";
        text += "Salary:\t" + currency.format(salary) + "\n";
        String dept = "";
        if (department == ADMIN)
            dept = "Administration";
        else if (department == EDITORIAL)
            dept = "Editorial";
        else if (department == MARKETING)
            dept = "Marketing";
        text += "Dept:\t" + dept + "\n";
        return text;
    }
}