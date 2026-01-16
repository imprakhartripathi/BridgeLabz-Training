package addressbook.dao;

import addressbook.impl.AddressBook;

public interface AddressBookDAO {
    void createAddressBook(String name);
    AddressBook getAddressBook(String name);
}
