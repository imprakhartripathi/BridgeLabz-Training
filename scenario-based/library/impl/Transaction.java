package library.impl;

public class Transaction {
    private Book book;
    private Member member;

    public Transaction(Book book, Member member) {
        this.book = book;
        this.member = member;
    }

    public void issueBook() throws BookNotAvailableException {
        book.issue();
    }

    public void returnBook(int daysLate, FineCalculator calc) {
        book.returnBook();
        System.out.println("Fine: ₹" + calc.calculateFine(daysLate));
    }
}
