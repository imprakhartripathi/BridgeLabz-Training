package addressbook;

import addressbook.dao.*;
import addressbook.service.*;

import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {

        AddressBookDAO dao = new AddressBookDAOImpl();
        AddressBookService service = new AddressBookServiceImpl(dao);
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Address Book Program");

        while (true) {
            System.out.println("""
                1.Create Address Book
                2.Add Contact
                3.Delete Contact
                4.Display Contacts
                5.Exit
                """);

            System.out.print("Enter Your Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 5) break;

            System.out.print("Address Book Name: ");
            String bookName = sc.nextLine();

            switch (choice) {
                case 1 -> service.createBook(bookName);
                case 2 -> service.addContact(bookName);
                case 3 -> service.deleteContact(bookName);
                case 4 -> service.displayContacts(bookName);
            }
        }
    }
}
