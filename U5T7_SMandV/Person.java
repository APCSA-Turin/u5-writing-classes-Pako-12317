package U5T7_SMandV;

public class Person {
    private String name;
    private boolean vaccinated;

    // Constructor
    public Person(String name) {
        this.name = name;
        this.vaccinated = false;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for vaccination status
    public boolean isVaccinated() {
        return vaccinated;
    }

    // Method to set vaccination status
    public void vaccinate() {
        this.vaccinated = true;
    }
}