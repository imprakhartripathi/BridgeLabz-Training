package m_one_ques.set4;

import java.util.*;
import java.util.regex.*;

public class DynamicTemplateProcessor {

    static String process(String type,String value){

        try{

            switch(type){

                case "UPPER":
                    return value.toUpperCase();

                case "LOWER":
                    return value.toLowerCase();

                case "DATE":

                    String[] p=value.split("-");
                    int d=Integer.parseInt(p[0]);
                    int m=Integer.parseInt(p[1]);
                    int y=Integer.parseInt(p[2]);

                    if(d<1||d>31||m<1||m>12) return "INVALID";

                    return y+"/"+String.format("%02d",m)+"/"+String.format("%02d",d);

                case "REPEAT":

                    String[] r=value.split(",");
                    String word=r[0];
                    int c=Integer.parseInt(r[1]);

                    return word.repeat(c);
            }

        }catch(Exception e){}

        return "INVALID";
    }

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();

        Pattern p=Pattern.compile("\\$\\{(.*?):(.*?)\\}");

        for(int i=0;i<n;i++){

            String line=sc.nextLine();
            Matcher m=p.matcher(line);

            StringBuffer sb=new StringBuffer();

            while(m.find()){
                String res=process(m.group(1),m.group(2));
                m.appendReplacement(sb,res);
            }

            m.appendTail(sb);

            System.out.println(sb);
        }
    }
}