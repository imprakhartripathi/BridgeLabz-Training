package linkedlist.impl;

import java.util.Scanner;

public class SocialMediaSLL {

    class Friend {
        int id;
        Friend next;
        Friend(int i){ id=i; }
    }

    class User {
        @SuppressWarnings("unused")
                int id;
        @SuppressWarnings("unused")
        int age;
        @SuppressWarnings("unused")
        String name;
        Friend friends;
        User next;
        User(int i,String n,int a){
            id=i;name=n;age=a;
        }
    }

    User head;
    Scanner sc=new Scanner(System.in);

    public void menu(){
        while(true){
            System.out.println("\n--- Social Media ---");
            System.out.println("1. Add User");
            System.out.println("2. Add Friend");
            System.out.println("3. Display Friends");
            System.out.println("0. Back");

            System.out.print("Choice: ");
            switch(sc.nextInt()){
                case 1 -> addUser();
                case 2 -> addFriend();
                case 3 -> displayFriends();
                case 0 -> { return; }
            }
        }
    }

    void addUser(){
        System.out.print("Enter - ID, Name, and Age: ");
        User u=new User(sc.nextInt(),sc.next(),sc.nextInt());
        u.next=head;
        head=u;
    }

    User find(int id){
        for(User u=head;u!=null;u=u.next)
            if(u.id==id) return u;
        return null;
    }

    void addFriend(){
        System.out.print("Enter - UserID, and FriendID: ");
        User u=find(sc.nextInt());
        int fid=sc.nextInt();
        if(u==null) return;
        Friend f=new Friend(fid);
        f.next=u.friends;
        u.friends=f;
    }

    void displayFriends(){
        System.out.print("User ID: ");
        User u=find(sc.nextInt());
        if(u==null) return;
        for(Friend f=u.friends;f!=null;f=f.next)
            System.out.println("Friend ID: "+f.id);
    }
}
