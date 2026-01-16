package addressbook.impl;

import addressbook.model.Contact;
import java.util.ArrayList;
import java.util.List;

public class AddressBook {

    private final String name;
    private final List<Contact> contacts = new ArrayList<>();

    public AddressBook(String name) {
        this.name = name;
    }

    public String getName() { return name; }

    public boolean addContact(Contact contact) {
        if (contacts.contains(contact)) return false;
        return contacts.add(contact);
    }

    public boolean deleteContact(String fullName) {
        return contacts.removeIf(
                c -> c.getFullName().equalsIgnoreCase(fullName)
        );
    }

    public List<Contact> getContacts() {
        return contacts;
    }
}
