package linkedlist.impl;

import java.util.Scanner;

public class TaskCLL {

    class Node {
        int id, priority;
        @SuppressWarnings("unused")
                String name;
        @SuppressWarnings("unused")
                String due;
        Node next;
        Node(int i,String n,int p,String d){
            id=i;name=n;priority=p;due=d;
        }
    }

    Node head;
    Scanner sc=new Scanner(System.in);

    public void menu(){
        while(true){
            System.out.println("\n--- Task Scheduler ---");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. Display");
            System.out.println("4. Search Priority");
            System.out.println("0. Back");

            System.out.print("Choice: ");
            switch(sc.nextInt()){
                case 1 -> add();
                case 2 -> remove();
                case 3 -> display();
                case 4 -> search();
                case 0 -> { return; }
            }
        }
    }

    void add(){
        System.out.print("Enter - ID, Name, Priority, and Due Date: ");
        Node n=new Node(sc.nextInt(),sc.next(),sc.nextInt(),sc.next());
        if(head==null){ head=n; n.next=head; }
        else{
            Node t=head;
            while(t.next!=head) t=t.next;
            t.next=n; n.next=head;
        }
    }

    void remove(){
        System.out.print("ID: ");
        int id=sc.nextInt();
        if(head==null) return;
        Node c=head,p=null;
        do{
            if(c.id==id){
                if(p!=null) p.next=c.next;
                else{
                    Node t=head;
                    while(t.next!=head) t=t.next;
                    head=head.next;
                    t.next=head;
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
            System.out.println(t.id+" "+t.name+" "+t.priority);
            t=t.next;
        }while(t!=head);
    }

    void search(){
        System.out.print("Priority: ");
        int p=sc.nextInt();
        Node t=head;
        do{
            if(t.priority==p)
                System.out.println(t.name);
            t=t.next;
        }while(t!=head);
    }
}
