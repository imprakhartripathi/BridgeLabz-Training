package library.impl;

public class Book {
    private String title;
    private boolean issued;

    public Book(String title) {
        this.title = title;
        this.issued = false;
    }

    public void issue() throws BookNotAvailableException {
        if (issued)
            throw new BookNotAvailableException("Book already issued");
        issued = true;
    }

    public void returnBook() {
        issued = false;
    }

    public String getTitle() {
        return title;
    }
}
