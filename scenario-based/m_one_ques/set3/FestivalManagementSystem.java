package m_one_ques.set3;

import java.util.*;

public class FestivalManagementSystem {

    static abstract class Festival{
        String name,location,date;
        Festival(String n,String l,String d){
            name=n;location=l;date=d;
        }
        abstract void display();
    }

    static class Music extends Festival{
        String headliner,genre;
        int price;

        Music(String n,String l,String d,String h,String g,int p){
            super(n,l,d);
            headliner=h;genre=g;price=p;
        }

        void display(){
            System.out.println("Festival Name: "+name);
            System.out.println("Location: "+location);
            System.out.println("Date: "+date);
            System.out.println("Headliner: "+headliner);
            System.out.println("Music Genre: "+genre);
            System.out.println("Ticket Price: "+price);
        }
    }

    static class Food extends Festival{
        String cuisine;
        int stalls,fee;

        Food(String n,String l,String d,String c,int s,int f){
            super(n,l,d);
            cuisine=c;stalls=s;fee=f;
        }

        void display(){
            System.out.println("Festival Name: "+name);
            System.out.println("Location: "+location);
            System.out.println("Date: "+date);
            System.out.println("Cuisine: "+cuisine);
            System.out.println("Number of Stalls: "+stalls);
            System.out.println("Entry Fee: "+fee);
        }
    }

    static class Art extends Festival{
        String type;
        int artists,fee;

        Art(String n,String l,String d,String t,int a,int f){
            super(n,l,d);
            type=t;artists=a;fee=f;
        }

        void display(){
            System.out.println("Festival Name: "+name);
            System.out.println("Location: "+location);
            System.out.println("Date: "+date);
            System.out.println("Art Type: "+type);
            System.out.println("Number of Artists: "+artists);
            System.out.println("Exhibition Fee: "+fee);
        }
    }

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        Map<String,Festival> map=new HashMap<>();

        while(true){

            String line=sc.nextLine();

            if(line.equals("EXIT")) break;

            String[] p=line.split(" ");

            if(p[0].equals("ADD_FESTIVAL")){

                switch(p[1]){

                    case "MUSIC":
                        map.put(p[2],new Music(
                                p[2],p[3],p[4],p[5],p[6],Integer.parseInt(p[7])
                        ));
                        break;

                    case "FOOD":
                        map.put(p[2],new Food(
                                p[2],p[3],p[4],p[5],
                                Integer.parseInt(p[6]),
                                Integer.parseInt(p[7])
                        ));
                        break;

                    case "ART":
                        map.put(p[2],new Art(
                                p[2],p[3],p[4],p[5],
                                Integer.parseInt(p[6]),
                                Integer.parseInt(p[7])
                        ));
                }
            }

            else if(p[0].equals("DISPLAY_DETAILS")){

                Festival f=map.get(p[1]);

                if(f!=null) f.display();
            }
        }
    }
}