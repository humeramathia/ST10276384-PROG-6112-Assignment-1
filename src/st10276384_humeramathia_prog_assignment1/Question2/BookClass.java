
package st10276384_humeramathia_prog_assignment1.Question2;

//----------------------------------------------------------Start of code----------------------------//

// BookClass class is the superclass of AvailableBook class
public class BookClass {
    private String title;
    private String author;
    private String ISBN;
// Constructor for BookClass class
    public BookClass(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }
// Getters for the private fields of BookClass class
    public String getTitle() {
        return title;
    }
// Getters for the private fields of BookClass class
    public String getAuthor() {
        return author;
    }
// Getters for the private fields of BookClass class
    public String getISBN() {
        return ISBN;
    }
// toString method to return the title, author and ISBN of the book
    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + ISBN;
    }
}

//----------------------------------------------------------End of code----------------------------//