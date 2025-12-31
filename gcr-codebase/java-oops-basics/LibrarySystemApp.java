public class LibrarySystemApp {

    public static void main(String[] args) {
        EBook ebook = new EBook();
        ebook.ISBN = "978-0134685991";
        ebook.title = "Effective Java";
        ebook.setAuthor("Joshua Bloch");

        ebook.display();
        System.out.println(ebook.title + "'s Author: " + ebook.getAuthor());
    }

    static class Book {
        public String ISBN;
        protected String title;
        private String author;

        public void setAuthor(String a) {
            author = a;
            System.out.println("Author set to: " + author + " for book: " + title);
        }

        public String getAuthor() {
            return author;
        }
    }

    static class EBook extends Book {
        void display() {
            System.out.println("ISBN: " + ISBN + " Title: " + title);
        }
    }
}
