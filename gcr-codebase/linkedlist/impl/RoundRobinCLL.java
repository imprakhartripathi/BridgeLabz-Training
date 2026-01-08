package linkedlist.impl;

import java.util.Scanner;

public class RoundRobinCLL {

    class Node {
        int pid, burst;
        Node next;
        Node(int p,int b){ pid=p; burst=b; }
    }

    Node head;
    Scanner sc=new Scanner(System.in);

    public void menu() {
        System.out.print("Time Quantum: ");
        int tq=sc.nextInt();

        while(true){
            System.out.println("\n--- Round Robin ---");
            System.out.println("1. Add Process");
            System.out.println("2. Execute");
            System.out.println("3. Display");
            System.out.println("0. Back");

            System.out.print("Choice: ");
            switch(sc.nextInt()){
                case 1 -> add();
                case 2 -> execute(tq);
                case 3 -> display();
                case 0 -> { return; }
            }
        }
    }

    void add(){
        System.out.print("Enter - Process ID, and Burst: ");
        Node n=new Node(sc.nextInt(),sc.nextInt());
        if(head==null){ head=n; n.next=head; }
        else{
            Node t=head;
            while(t.next!=head) t=t.next;
            t.next=n; n.next=head;
        }
    }

    void execute(int tq){
        if(head==null) return;
        Node c=head, p=null;
        do{
            c.burst -= tq;
            if(c.burst<=0){
                System.out.println("Process "+c.pid+" completed");
                if(p!=null) p.next=c.next;
                else{
                    Node t=head;
                    while(t.next!=head) t=t.next;
                    head=c.next; t.next=head;
                }
            }
            p=c;
            c=c.next;
        }while(c!=head);
    }

    void display(){
        if(head==null) return;
        Node t=head;
        do{
            System.out.println("PID "+t.pid+" Burst "+t.burst);
            t=t.next;
        }while(t!=head);
    }
}
