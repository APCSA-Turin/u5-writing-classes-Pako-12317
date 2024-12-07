package U5T7_StaticVariables;

public class Employee {
    // Instance variables
    private String firstName;
    private String lastName;
    private int employeeID;

    // Static variables
    private static int mostRecentEmployeeID = 99; // Starts at 99 to make first ID 100
    private static int totalEmployeesCreated = 0;

    // Constructor
    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        
        // Generate and assign ID
        this.employeeID = ++mostRecentEmployeeID;
        
        // Increment the total number of employees created
        totalEmployeesCreated++;
    }

    // Instance method to get the full name of the Employee
    public String getFullName() {
        return firstName + " " + lastName;
    }

    // Instance method to get the Employee ID
    public int getID() {
        return employeeID;
    }

    // Static method to get the most recent Employee ID
    public static int getMostRecentEmployeeID() {
        return mostRecentEmployeeID;
    }

    // Static method to get the total number of Employees created
    public static int getTotalEmployeesCreated() {
        return totalEmployeesCreated;
    }

    // Instance method to get Employee information
    public String employeeInfo() {
        return "--------------------------\n" +
               "Employee full name: " + getFullName() + "\n" +
               "Employee ID: " + getID() + "\n" +
               "Most recent ID assigned: " + getMostRecentEmployeeID() + "\n" +
               "Total employees hired: " + getTotalEmployeesCreated() + "\n" +
               "--------------------------";
    }
}