package U5T7_SMandV;

public class Library {
    private static int totalBooksInSystem = 0; // Static variable to track total books across all libraries
    private static int totalLibraries = 0;    // Static variable to track number of libraries

    private String name;           // Instance variable for library name
    private int booksAvailable;    // Instance variable for books available in this library

    // Constructor
    public Library(String name, int initialBooks) {
        this.name = name;
        this.booksAvailable = initialBooks;
        totalBooksInSystem += initialBooks;
        totalLibraries++;
    }

    // Instance method to add books to this library
    public void addBooks(int count) {
        booksAvailable += count;
        totalBooksInSystem += count;
    }

    // Instance method to lend books (if available)
    public boolean lendBook() {
        if (booksAvailable > 0) {
            booksAvailable--;
            totalBooksInSystem--;
            return true;
        }
        return false;
    }

    // Instance method to get books available in this library
    public int getBooksAvailable() {
        return booksAvailable;
    }

    // Instance method to get the library's name
    public String getName() {
        return name;
    }

    // Static method to get the total number of books in the system
    public static int getTotalBooksInSystem() {
        return totalBooksInSystem;
    }

    // Static method to get the total number of libraries
    public static int getTotalLibraries() {
        return totalLibraries;
    }

    public static void main(String[] args) {
        // Display initial state
        System.out.println("Total libraries: " + Library.getTotalLibraries());
        System.out.println("Total books in system: " + Library.getTotalBooksInSystem());
 
        // Create libraries
        Library cityLibrary = new Library("City Library", 100);
        Library townLibrary = new Library("Town Library", 50);
 
        // Display stats after creating libraries
        System.out.println("\nAfter creating libraries:");
        System.out.println("Total libraries: " + Library.getTotalLibraries());
        System.out.println("Total books in system: " + Library.getTotalBooksInSystem());
        System.out.println(cityLibrary.getName() + " has " + cityLibrary.getBooksAvailable() + " books.");
        System.out.println(townLibrary.getName() + " has " + townLibrary.getBooksAvailable() + " books.");
 
        // Add books to libraries
        cityLibrary.addBooks(20);
        townLibrary.addBooks(10);
 
        // Display stats after adding books
        System.out.println("\nAfter adding books:");
        System.out.println("Total books in system: " + Library.getTotalBooksInSystem());
        System.out.println(cityLibrary.getName() + " has " + cityLibrary.getBooksAvailable() + " books.");
        System.out.println(townLibrary.getName() + " has " + townLibrary.getBooksAvailable() + " books.");
 
        // Lend books
        cityLibrary.lendBook();
        townLibrary.lendBook();
 
        // Display stats after lending books
        System.out.println("\nAfter lending books:");
        System.out.println("Total books in system: " + Library.getTotalBooksInSystem());
        System.out.println(cityLibrary.getName() + " has " + cityLibrary.getBooksAvailable() + " books.");
        System.out.println(townLibrary.getName() + " has " + townLibrary.getBooksAvailable() + " books.");
    }
}
