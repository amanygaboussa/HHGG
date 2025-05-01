import java.util.Date;

public class BorrowingProcess {
    private Book book;
    private Borrower borrower;
    private Date borrowDate;
    private Date returnDate;

    public BorrowingProcess(Book book, Borrower borrower) {
        this.book = book;
        this.borrower = borrower;
        this.borrowDate = new Date();
        this.returnDate = null;
    }

    public void returnBook() {
        this.returnDate = new Date();
        borrower.returnBook(book);
    }

    public Book getBook() {
        return book;
    }

    public Borrower getBorrower() {
        return borrower;
    }

    public Date getBorrowDate() {
        return borrowDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }
}

