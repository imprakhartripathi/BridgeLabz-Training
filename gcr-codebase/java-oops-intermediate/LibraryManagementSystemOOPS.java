@SuppressWarnings("unused")
interface Reservable {
    void reserveItem();

    boolean checkAvailability();
}

abstract class LibraryItem {
    @SuppressWarnings({"unused", "FieldMayBeFinal"})
    private String itemId;
    @SuppressWarnings("FieldMayBeFinal")
    private String title;
    @SuppressWarnings("FieldMayBeFinal")
    private String author;

    protected LibraryItem(String id, String title, String author) {
        this.itemId = id;
        this.title = title;
        this.author = author;
    }

    public abstract int getLoanDuration();

    public void getItemDetails() {
        System.out.println(title + " by " + author);
    }
}

class Book extends LibraryItem {
    public Book(String id, String title, String author) {
        super(id, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 14;
    }
}

@SuppressWarnings("unused")
class Magazine extends LibraryItem {
    public Magazine(String id, String title, String author) {
        super(id, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7;
    }
}

@SuppressWarnings("unused")
class DVD extends LibraryItem {
    public DVD(String id, String title, String author) {
        super(id, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 3;
    }
}

public class LibraryManagementSystemOOPS {
    public static void main(String[] args) {
        LibraryItem item = new Book("B1", "Clean Code", "Robert Martin");
        item.getItemDetails();
        System.out.println(item.getLoanDuration());
    }
}
