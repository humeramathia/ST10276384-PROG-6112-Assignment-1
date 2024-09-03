
package st10276384_humeramathia_prog_assignment1.Question2;

//-------------------------------------------Start of code----------------------------//
// Library class to add, borrow, return and generate report of books
public class Library {
    private BookClass[] books;
    private int count;
// Constructor for Library class
    public Library(int capacity) {
        books = new BookClass[capacity];
        count = 0;
    }
// Method to add book to the library
    public void addBook(BookClass book) {
        if (count < books.length) {
            books[count++] = book;
        } else {
            System.out.println("Library is full, can't add more books.");
        }
    }
// Method to borrow book from the library
    public void borrowBook(String ISBN, String borrower, String dueDate) {
        for (int i = 0; i < count; i++) {
            if (books[i] instanceof AvailableBook && books[i].getISBN().equals(ISBN)) {
                books[i] = new BorrowedBook(books[i].getTitle(), books[i].getAuthor(), ISBN, borrower, dueDate);
                System.out.println("Book borrowed successfully.");
                return;
            }
        }
        System.out.println("Book not available for borrowing.");
    }
// Method to return book to the library
    public void returnBook(String ISBN) {
        for (int i = 0; i < count; i++) {
            if (books[i] instanceof BorrowedBook && books[i].getISBN().equals(ISBN)) {
                books[i] = new AvailableBook(books[i].getTitle(), books[i].getAuthor(), ISBN);
                System.out.println("Book returned successfully.");
                return;
            }
        }
        System.out.println("Book not found in borrowed list.");
    }
// Method to generate report of the library
    public void generateReport() {
        System.out.println("Library Report:");
        for (int i = 0; i < count; i++) {
            System.out.println(books[i].toString());
        }
    }

    public int getBooksCount() {
        return count;
    }
// Method to get book by ISBN
    public BookClass getBookByISBN(String ISBN) {
        for (int i = 0; i < count; i++) {
            if (books[i].getISBN().equals(ISBN)) {
                return books[i];
            }
        }
        return null;
    }
}
//-------------------------------------------End of code----------------------------//
