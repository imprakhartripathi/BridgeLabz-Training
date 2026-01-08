package linkedlist.impl;

import java.util.Scanner;

public class InventorySLL {

    class Node {
        int id, qty;
        String name;
        double price;
        Node next;

        Node(int id, String n, int q, double p) {
            this.id = id; name = n; qty = q; price = p;
        }
    }

    Node head;
    Scanner sc = new Scanner(System.in);

    public void menu() {
        while (true) {
            System.out.println("\n--- Inventory System ---");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. Update Quantity");
            System.out.println("4. Search");
            System.out.println("5. Total Inventory Value");
            System.out.println("6. Display");
            System.out.println("0. Back");

            System.out.print("Choice: ");
            switch (sc.nextInt()) {
                case 1 -> add();
                case 2 -> remove();
                case 3 -> updateQty();
                case 4 -> search();
                case 5 -> totalValue();
                case 6 -> display();
                case 0 -> { return; }
            }
        }
    }

    void add() {
        System.out.print(" Enter - ID, Name, Qty, and Price: ");
        Node n = new Node(sc.nextInt(), sc.next(), sc.nextInt(), sc.nextDouble());
        if (head == null) head = n;
        else {
            Node t = head;
            while (t.next != null) t = t.next;
            t.next = n;
        }
    }

    void remove() {
        System.out.print("Item ID: ");
        int id = sc.nextInt();
        if (head == null) return;
        if (head.id == id) { head = head.next; return; }
        Node t = head;
        while (t.next != null && t.next.id != id) t = t.next;
        if (t.next != null) t.next = t.next.next;
    }

    void updateQty() {
        System.out.print("Enter - ID, and NewQty: ");
        int id = sc.nextInt(), q = sc.nextInt();
        for (Node t = head; t != null; t = t.next)
            if (t.id == id) t.qty = q;
    }

    void search() {
        System.out.print("Item Name or ID: ");
        String key = sc.next();
        for (Node t = head; t != null; t = t.next)
            if (t.name.equals(key) || String.valueOf(t.id).equals(key))
                System.out.println(t.id + " " + t.name + " " + t.qty + " " + t.price);
    }

    void totalValue() {
        double sum = 0;
        for (Node t = head; t != null; t = t.next)
            sum += t.qty * t.price;
        System.out.println("Total Inventory Value = " + sum);
    }

    void display() {
        for (Node t = head; t != null; t = t.next)
            System.out.println(t.id + " " + t.name + " " + t.qty + " " + t.price);
    }
}
