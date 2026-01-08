package linkedlist.impl;

import java.util.Scanner;

public class LibraryDLL {

    class Node {
        int id;
        @SuppressWarnings("unused")
                String title;
        @SuppressWarnings("unused")
                String author;
        @SuppressWarnings("unused")
                String genre;
        boolean available;
        Node prev, next;

        Node(int i,String t,String a,String g,boolean av){
            id=i;title=t;author=a;genre=g;available=av;
        }
    }

    Node head, tail;
    Scanner sc = new Scanner(System.in);

    public void menu() {
        while (true) {
            System.out.println("\n--- Library System ---");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Search");
            System.out.println("4. Update Availability");
            System.out.println("5. Display Forward");
            System.out.println("6. Display Reverse");
            System.out.println("7. Count Books");
            System.out.println("0. Back");

            System.out.print("Choice: ");
            switch (sc.nextInt()) {
                case 1 -> add();
                case 2 -> remove();
                case 3 -> search();
                case 4 -> update();
                case 5 -> forward();
                case 6 -> reverse();
                case 7 -> count();
                case 0 -> { return; }
            }
        }
    }

    void add() {
        System.out.print("Enter - ID, Title, Author, Genre, and is Available(true/false): ");
        Node n = new Node(sc.nextInt(), sc.next(), sc.next(), sc.next(), sc.nextBoolean());
        if (head == null) head = tail = n;
        else { tail.next = n; n.prev = tail; tail = n; }
    }

    void remove() {
        System.out.print("Book ID: ");
        int id = sc.nextInt();
        for (Node c = head; c != null; c = c.next)
            if (c.id == id) {
                if (c.prev != null) c.prev.next = c.next;
                else head = c.next;
                if (c.next != null) c.next.prev = c.prev;
                else tail = c.prev;
            }
    }

    void search() {
        System.out.print("Title or Author: ");
        String k = sc.next();
        for (Node c = head; c != null; c = c.next)
            if (c.title.equals(k) || c.author.equals(k))
                System.out.println(c.title + " " + c.author);
    }

    void update() {
        System.out.print("Enter - Book ID, and Availability: ");
        int id = sc.nextInt();
        boolean a = sc.nextBoolean();
        for (Node c = head; c != null; c = c.next)
            if (c.id == id) c.available = a;
    }

    void forward() {
        for (Node c = head; c != null; c = c.next)
            System.out.println(c.id + " " + c.title + " " + c.available);
    }

    void reverse() {
        for (Node c = tail; c != null; c = c.prev)
            System.out.println(c.id + " " + c.title + " " + c.available);
    }

    void count() {
        int cnt = 0;
        for (Node c = head; c != null; c = c.next) cnt++;
        System.out.println("Total Books = " + cnt);
    }
}
