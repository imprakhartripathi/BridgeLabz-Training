package addressbook.service;

public interface AddressBookService {
    void createBook(String name);
    void addContact(String bookName);
    void deleteContact(String bookName);
    void displayContacts(String bookName);
}
