package linkedlist.impl;

import java.util.Scanner;

public class TicketCLL {

    class Node {
        int id, seat;
        @SuppressWarnings("unused")
                String customer;
        @SuppressWarnings("unused")
                String movie;
        @SuppressWarnings("unused")
        String time;
        Node next;
        Node(int i,String c,String m,int s,String t){
            id=i;customer=c;movie=m;seat=s;time=t;
        }
    }

    Node head;
    Scanner sc = new Scanner(System.in);

    public void menu(){
        while(true){
            System.out.println("\n--- Ticket System ---");
            System.out.println("1. Book Ticket");
            System.out.println("2. Cancel Ticket");
            System.out.println("3. Display Tickets");
            System.out.println("4. Count Tickets");
            System.out.println("0. Back");

            System.out.print("Choice: ");
            switch(sc.nextInt()){
                case 1 -> add();
                case 2 -> remove();
                case 3 -> display();
                case 4 -> count();
                case 0 -> { return; }
            }
        }
    }

    void add(){
        System.out.print("Enter - ID, Customer, Movie, Seat, and Time: ");
        Node n=new Node(sc.nextInt(),sc.next(),sc.next(),sc.nextInt(),sc.next());
        if(head==null){ head=n; n.next=head; }
        else{
            Node t=head;
            while(t.next!=head) t=t.next;
            t.next=n; n.next=head;
        }
    }

    void remove(){
        System.out.print("Ticket ID: ");
        int id=sc.nextInt();
        if(head==null) return;
        Node c=head,p=null;
        do{
            if(c.id==id){
                if(p!=null) p.next=c.next;
                else{
                    Node t=head;
                    while(t.next!=head) t=t.next;
                    head=c.next; t.next=head;
                }
                return;
            }
            p=c; c=c.next;
        }while(c!=head);
    }

    void display(){
        if(head==null) return;
        Node t=head;
        do{
            System.out.println(t.id+" "+t.customer+" "+t.movie+" Seat:"+t.seat);
            t=t.next;
        }while(t!=head);
    }

    void count(){
        int cnt=0;
        Node t=head;
        do{ cnt++; t=t.next; }while(t!=head);
        System.out.println("Total Tickets = "+cnt);
    }
}
