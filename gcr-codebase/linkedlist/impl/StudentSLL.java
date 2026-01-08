package linkedlist.impl;

import java.util.Scanner;

public class StudentSLL {

    class Node {
        int roll, age;
        String name, grade;
        Node next;
        Node(int r, String n, int a, String g) {
            roll=r; name=n; age=a; grade=g;
        }
    }

    Node head;
    Scanner sc = new Scanner(System.in);

    public void menu() {
        while (true) {
            System.out.println("\n--- Student Records ---");
            System.out.println("1. Add (End)");
            System.out.println("2. Delete by Roll");
            System.out.println("3. Search");
            System.out.println("4. Update Grade");
            System.out.println("5. Display");
            System.out.println("0. Back");

            System.out.print("Choice: ");
            switch (sc.nextInt()) {
                case 1 -> add();
                case 2 -> delete();
                case 3 -> search();
                case 4 -> update();
                case 5 -> display();
                case 0 -> { return; }
            }
        }
    }

    void add() {
        System.out.print("Enter - Roll Number, Name, Age, and Grade: ");
        Node n = new Node(sc.nextInt(), sc.next(), sc.nextInt(), sc.next());
        if (head==null) head=n;
        else {
            Node t=head;
            while(t.next!=null) t=t.next;
            t.next=n;
        }
    }

    void delete() {
        System.out.print("Roll: ");
        int r=sc.nextInt();
        if(head==null) return;
        if(head.roll==r){ head=head.next; return; }
        Node t=head;
        while(t.next!=null && t.next.roll!=r) t=t.next;
        if(t.next!=null) t.next=t.next.next;
    }

    void search() {
        System.out.print("Roll: ");
        int r=sc.nextInt();
        for(Node t=head;t!=null;t=t.next)
            if(t.roll==r)
                System.out.println(t.roll+" "+t.name+" "+t.grade);
    }

    void update() {
        System.out.print("Enter - Roll Number, and NewGrade: ");
        int r=sc.nextInt(); String g=sc.next();
        for(Node t=head;t!=null;t=t.next)
            if(t.roll==r) t.grade=g;
    }

    void display() {
        for(Node t=head;t!=null;t=t.next)
            System.out.println(t.roll+" "+t.name+" "+t.age+" "+t.grade);
    }
}
