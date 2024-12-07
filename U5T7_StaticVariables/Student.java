package U5T7_StaticVariables;

public class Student {
    // Class variables
    private static int totalPointsEarned = 0;
    private static int greatestPoints = 0;

    // Instance variables
    private String firstName;
    private int points;

    // Constructor
    public Student(String firstName) {
        this.firstName = firstName;
        this.points = 0; // Default value
    }

    // Instance method to return student info
    public String studentInfo() {
        return "Student: " + firstName + "\nStudent's Points: " + points;
    }

    // Instance method to add points to a student
    public void addPoints(int points) {
        this.points += points;
        totalPointsEarned += points;

        if (this.points > greatestPoints) {
            greatestPoints = this.points;
        }
    }

    // Static method to get total points earned by all students
    public static int getTotalPointsEarned() {
        return totalPointsEarned;
    }

    // Static method to get the greatest number of points by any student
    public static int getGreatestPoints() {
        return greatestPoints;
    }

    // Static method to return class-level info
    public static String classInfo() {
        return "Total points earned by all students: " + totalPointsEarned +
               "\nMost points earned by any student: " + greatestPoints;
    }
}
