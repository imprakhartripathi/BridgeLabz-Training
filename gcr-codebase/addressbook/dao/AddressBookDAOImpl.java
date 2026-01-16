package addressbook.dao;

import addressbook.impl.AddressBook;
import java.util.HashMap;
import java.util.Map;

public class AddressBookDAOImpl implements AddressBookDAO {

    private final Map<String, AddressBook> books = new HashMap<>();

    @Override
    public void createAddressBook(String name) {
        books.putIfAbsent(name, new AddressBook(name));
    }

    @Override
    public AddressBook getAddressBook(String name) {
        return books.get(name);
    }
}
