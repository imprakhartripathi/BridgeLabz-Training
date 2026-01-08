package linkedlist.impl;

import java.util.Scanner;

public class UndoRedoDLL {

    class Node {
        String text;
        Node prev, next;
        Node(String t){ text=t; }
    }

    Node current;
    Scanner sc=new Scanner(System.in);

    public void menu(){
        while(true){
            System.out.println("\n--- Undo / Redo ---");
            System.out.println("1. Type");
            System.out.println("2. Undo");
            System.out.println("3. Redo");
            System.out.println("4. Display");
            System.out.println("0. Back");

            System.out.print("Choice: ");
            switch(sc.nextInt()){
                case 1 -> type();
                case 2 -> undo();
                case 3 -> redo();
                case 4 -> display();
                case 0 -> { return; }
            }
        }
    }

    void type(){
        System.out.print("Text: ");
        Node n=new Node(sc.next());
        if(current!=null){
            current.next=n;
            n.prev=current;
        }
        current=n;
    }

    void undo(){
        if(current!=null && current.prev!=null)
            current=current.prev;
    }

    void redo(){
        if(current!=null && current.next!=null)
            current=current.next;
    }

    void display(){
        if(current!=null)
            System.out.println("Current Text: "+current.text);
    }
}
