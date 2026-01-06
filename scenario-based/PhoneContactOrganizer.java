import java.util.*;

public class PhoneContactOrganizer {

    static class InvalidPhoneNumberException extends Exception {
        public InvalidPhoneNumberException(String msg) {
            super(msg);
        }
    }

    static class Contact {
        String name;
        String phone;

        Contact(String name, String phone) {
            this.name = name;
            this.phone = phone;
        }
    }

    static List<Contact> contacts = new ArrayList<>();

    public static void addContact(String name, String phone) throws InvalidPhoneNumberException {
        if (!phone.matches("\\d{10}"))
            throw new InvalidPhoneNumberException("Phone number must be exactly 10 digits.");

        for (Contact c : contacts) {
            if (c.phone.equals(phone))
                throw new InvalidPhoneNumberException("Duplicate contact detected.");
        }

        contacts.add(new Contact(name, phone));
        System.out.println("Contact added successfully.");
    }

    public static void deleteContact(String phone) {
        boolean removed = contacts.removeIf(c -> c.phone.equals(phone));
        System.out.println(removed ? "Contact deleted." : "Contact not found.");
    }

    public static void searchContact(String phone) {
        for (Contact c : contacts) {
            if (c.phone.equals(phone)) {
                System.out.println("Name: " + c.name + ", Phone: " + c.phone);
                return;
            }
        }
        System.out.println("Contact not found.");
    }

    public static void displayAll() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts available.");
            return;
        }

        for (Contact c : contacts) {
            System.out.println(c.name + " - " + c.phone);
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int choice;
            
            do {
                System.out.println("\n--- Phone Contact Organizer ---");
                System.out.println("1. Add Contact");
                System.out.println("2. Delete Contact");
                System.out.println("3. Search Contact");
                System.out.println("4. Display All Contacts");
                System.out.println("5. Exit");
                System.out.print("Enter choice: ");
                
                choice = sc.nextInt();
                sc.nextLine(); // consume newline
                
                try {
                    switch (choice) {
                        case 1 -> {
                            System.out.print("Enter Name: ");
                            String name = sc.nextLine();
                            System.out.print("Enter Phone: ");
                            String phone = sc.nextLine();
                            addContact(name, phone);
                        }
                        
                        case 2 -> {
                            System.out.print("Enter Phone to delete: ");
                            deleteContact(sc.nextLine());
                        }
                        
                        case 3 -> {
                            System.out.print("Enter Phone to search: ");
                            searchContact(sc.nextLine());
                        }
                        
                        case 4 -> displayAll();
                        
                        case 5 -> System.out.println("Exiting application.");
                        
                        default -> System.out.println("Invalid choice.");
                    }
                } catch (InvalidPhoneNumberException e) {
                    System.out.println("Error: " + e.getMessage());
                }
                
            } while (choice != 5);
        }
    }
}
