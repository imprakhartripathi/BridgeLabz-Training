package addressbook.service;

import addressbook.dao.AddressBookDAO;
import addressbook.impl.AddressBook;
import addressbook.model.Contact;

import java.util.Scanner;

public class AddressBookServiceImpl implements AddressBookService {

    private final AddressBookDAO dao;
    private final Scanner sc = new Scanner(System.in);

    public AddressBookServiceImpl(AddressBookDAO dao) {
        this.dao = dao;
    }

    @Override
    public void createBook(String name) {
        dao.createAddressBook(name);
    }

    @Override
    public void addContact(String bookName) {
        AddressBook book = dao.getAddressBook(bookName);
        if (book == null) return;

        System.out.print("First Name: ");
        String fn = sc.nextLine();
        System.out.print("Last Name: ");
        String ln = sc.nextLine();
        System.out.print("City: ");
        String city = sc.nextLine();
        System.out.print("State: ");
        String state = sc.nextLine();
        System.out.print("Phone: ");
        String phone = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Address: ");
        String address = sc.nextLine();
        System.out.print("Zip: ");
        String zip = sc.nextLine();

        boolean added = book.addContact(
                new Contact(fn, ln, address, city, state, zip, phone, email)
        );


        System.out.println(added ? "Contact added" : "Duplicate contact");
    }

    @Override
    public void deleteContact(String bookName) {
        AddressBook book = dao.getAddressBook(bookName);
        if (book == null) return;

        System.out.print("Enter full name: ");
        String name = sc.nextLine();
        System.out.println(
                book.deleteContact(name) ? "Deleted" : "Not found"
        );
    }

    @Override
    public void displayContacts(String bookName) {
        AddressBook book = dao.getAddressBook(bookName);
        if (book == null) return;
        book.getContacts().forEach(System.out::println);
    }
}
