package library;

import library.impl.*;

public class Driver {
    public static void main(String[] args) {
        Book book = new Book("Clean Code");
        Member member = new Member(1, "Rohit");

        Transaction tx = new Transaction(book, member);
        FineCalculator calc = new StudentFineCalculator();

        try {
            tx.issueBook();
            tx.returnBook(5, calc);
        } catch (BookNotAvailableException e) {
            System.out.println(e.getMessage());
        }
    }
}
