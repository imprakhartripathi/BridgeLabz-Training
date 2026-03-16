package m_one_ques.set4;

import java.util.*;

public class SupermarketInventorySystem {

    static abstract class Product{
        String name;
        double price;
        int quantity;

        Product(String n,double p,int q){
            name=n;price=p;quantity=q;
        }

        abstract void display();

        double total(){
            return price*quantity;
        }
    }

    static class Electronics extends Product{

        int warranty;

        Electronics(String n,double p,int q,int w){
            super(n,p,q);
            warranty=w;
        }

        void display(){
            System.out.println(name+" - Price: "+price+", Quantity: "+quantity+", Warranty: "+warranty+" months");
        }
    }

    static class Clothing extends Product{

        String size;

        Clothing(String n,double p,int q,String s){
            super(n,p,q);
            size=s;
        }

        void display(){
            System.out.println(name+" - Price: "+price+", Quantity: "+quantity+", Size: "+size);
        }
    }

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();

        List<Product> list=new ArrayList<>();

        for(int i=0;i<n;i++){

            String[] p=sc.nextLine().split(", ");

            if(p[0].equals("Electronics")){

                Product e=new Electronics(
                        p[1],
                        Double.parseDouble(p[2]),
                        Integer.parseInt(p[3]),
                        Integer.parseInt(p[4])
                );

                list.add(e);
                System.out.println("Product added to inventory: "+p[1]);
            }

            else{

                Product c=new Clothing(
                        p[1],
                        Double.parseDouble(p[2]),
                        Integer.parseInt(p[3]),
                        p[4]
                );

                list.add(c);
                System.out.println("Product added to inventory: "+p[1]);
            }
        }

        System.out.println("Inventory:");

        double total=0;

        for(Product p:list){
            p.display();
            total+=p.total();
        }

        System.out.printf("Total value of the inventory: %.2f\n",total);
    }
}