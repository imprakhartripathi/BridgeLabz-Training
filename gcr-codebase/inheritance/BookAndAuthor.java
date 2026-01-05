class Book {
    protected String title;
    protected int publicationYear;

    Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }
}

class Author extends Book {
    private String authorName;
    @SuppressWarnings("unused")
    private String bio;

    Author(String title, int year, String authorName, String bio) {
        super(title, year);
        this.authorName = authorName;
        this.bio = bio;
    }

    void displayInfo() {
        System.out.println(title + " (" + publicationYear + ")");
        System.out.println("Author: " + authorName);
    }
}
