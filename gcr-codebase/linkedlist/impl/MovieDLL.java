package linkedlist.impl;

import java.util.Scanner;

public class MovieDLL {

    class Node {
        String title, director;
        @SuppressWarnings("unused")
        int year; double rating;
        Node prev, next;
        Node(String t,String d,int y,double r){
            title=t;director=d;year=y;rating=r;
        }
    }

    Node head, tail;
    Scanner sc = new Scanner(System.in);

    public void menu() {
        while(true){
            System.out.println("\n--- Movies ---");
            System.out.println("1. Add");
            System.out.println("2. Remove");
            System.out.println("3. Search Director");
            System.out.println("4. Update Rating");
            System.out.println("5. Display Forward");
            System.out.println("6. Display Reverse");
            System.out.println("0. Back");

            System.out.print("Choice: ");
            switch(sc.nextInt()){
                case 1 -> add();
                case 2 -> remove();
                case 3 -> search();
                case 4 -> update();
                case 5 -> forward();
                case 6 -> reverse();
                case 0 -> { return; }
            }
        }
    }

    void add(){
        System.out.print("Enter - Title, Director, Year, and Rating: ");
        Node n=new Node(sc.next(),sc.next(),sc.nextInt(),sc.nextDouble());
        if(head==null) head=tail=n;
        else{ tail.next=n; n.prev=tail; tail=n; }
    }

    void remove(){
        System.out.print("Title: ");
        String t=sc.next();
        for(Node c=head;c!=null;c=c.next)
            if(c.title.equals(t)){
                if(c.prev!=null) c.prev.next=c.next;
                else head=c.next;
                if(c.next!=null) c.next.prev=c.prev;
                else tail=c.prev;
            }
    }

    void search(){
        System.out.print("Director: ");
        String d=sc.next();
        for(Node c=head;c!=null;c=c.next)
            if(c.director.equals(d))
                System.out.println(c.title+" "+c.rating);
    }

    void update(){
        System.out.print("Enter - Title, and NewRating: ");
        String t=sc.next(); double r=sc.nextDouble();
        for(Node c=head;c!=null;c=c.next)
            if(c.title.equals(t)) c.rating=r;
    }

    void forward(){
        for(Node c=head;c!=null;c=c.next)
            System.out.println(c.title+" "+c.director+" "+c.rating);
    }

    void reverse(){
        for(Node c=tail;c!=null;c=c.prev)
            System.out.println(c.title+" "+c.director+" "+c.rating);
    }
}
