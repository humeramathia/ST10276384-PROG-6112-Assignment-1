
package st10276384_humeramathia_prog_assignment1.Question2;

//----------------------------------------------------------Start of code----------------------------//
// BorrowedBook class is a subclass of BookClass class
public class BorrowedBook extends BookClass {
    private String borrower;
    private String dueDate;

    public BorrowedBook(String title, String author, String ISBN, String borrower, String dueDate) {
        super(title, author, ISBN);
        this.borrower = borrower;
        this.dueDate = dueDate;
    }

    @Override
    public String toString() {
        return super.toString() + ", Borrower: " + borrower + ", Due Date: " + dueDate;
    }

    public Object getBorrower() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

  
}

//----------------------------------------------------------End of code----------------------------//