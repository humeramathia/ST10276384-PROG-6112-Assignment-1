
package st10276384_humeramathia_prog_assignment1.Question2;
//------------------------------------------------------------Start of code--------------------------------------------//

// Main class to test the Library class
public class Main {
    public static void main(String[] args) {
        Library library = new Library(5);

        library.addBook(new AvailableBook("1984", "George Orwell", "1234567890"));
        library.addBook(new AvailableBook("To Kill a Mockingbird", "Harper Lee", "2345678901"));
        library.addBook(new AvailableBook("The Great Gatsby", "F. Scott Fitzgerald", "3456789012"));

        library.generateReport();

        library.borrowBook("1234567890", "John Doe", "2024-10-10");
        library.generateReport();

        library.returnBook("1234567890");
        library.generateReport();
    }
}
