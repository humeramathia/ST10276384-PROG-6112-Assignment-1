import java.awt.print.Book;
import org.junit.Test;
import static org.junit.Assert.*;
import st10276384_humeramathia_prog_assignment1.Question2.AvailableBook;
import st10276384_humeramathia_prog_assignment1.Question2.BorrowedBook;
import st10276384_humeramathia_prog_assignment1.Question2.Library;
import st10276384_humeramathia_prog_assignment1.Question2.BookClass;

//----------------------------------------------------------Start of code----------------------------//

// Test class for Question2
public class Question2Test {
    @Test
    public void testAddBook() {
        Library library = new Library(2);
        library.addBook(new AvailableBook("Test Book 1", "Author A", "ISBN0001"));
        library.addBook(new AvailableBook("Test Book 2", "Author B", "ISBN0002"));

        // Attempt to add a third book in a library with capacity of 2
        library.addBook(new AvailableBook("Test Book 3", "Author C", "ISBN0003"));

        // Test if the count is still 2
        assertEquals(2, library.getBooksCount());
    }

    // Test to borrow a book
    @Test
    public void testBorrowBook() {
        Library library = new Library(1);
        library.addBook(new AvailableBook("Test Book", "Author A", "ISBN0001"));
        library.borrowBook("ISBN0001", "John Doe", "2024-10-10");

        BookClass borrowedBook = library.getBookByISBN("ISBN0001");
        assertTrue(borrowedBook instanceof BorrowedBook);
        assertEquals("John Doe", ((BorrowedBook) borrowedBook).getBorrower());
    }

    // Test to return a book
    @Test
    public void testReturnBook() {
        Library library = new Library(1);
        library.addBook(new AvailableBook("Test Book", "Author A", "ISBN0001"));
        library.borrowBook("ISBN0001", "John Doe", "2024-10-10");
        library.returnBook("ISBN0001");

        BookClass returnedBook = library.getBookByISBN("ISBN0001");
        assertTrue(returnedBook instanceof AvailableBook);
    }
}

// ----------------------------------------------------------End of code----------------------------//