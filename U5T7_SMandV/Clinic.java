package U5T7_SMandV;

public class Clinic {
    private static int totalClinics = 0;
    private static int totalVaccinesGiven = 0;

    private int clinicVaccineCount;
    private Person mostRecentlyVaccinated;

    // Constructor
    public Clinic() {
        clinicVaccineCount = 0;
        mostRecentlyVaccinated = null;
        totalClinics++;
    }

    // Vaccinate a person
    public boolean vaccinate(Person person) {
        if (!person.isVaccinated()) {
            person.vaccinate();
            clinicVaccineCount++;
            totalVaccinesGiven++;
            mostRecentlyVaccinated = person;
            return true;
        }
        return false;
    }

    // Getter for clinic-specific vaccine count
    public int getClinicVaccineCount() {
        return clinicVaccineCount;
    }

    // Getter for most recently vaccinated person at this clinic
    public Person mostRecentlyVaccinated() {
        return mostRecentlyVaccinated;
    }

    // Static method to get total clinics
    public static int getTotalClinics() {
        return totalClinics;
    }

    // Static method to get total vaccines given
    public static int getTotalVaccineCount() {
        return totalVaccinesGiven;
    }
}