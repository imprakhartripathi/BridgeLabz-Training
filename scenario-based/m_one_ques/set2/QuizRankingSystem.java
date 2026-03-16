package m_one_ques.set2;

import java.util.*;

public class QuizRankingSystem {

    static class Student{
        String name,dept;
        int q1,q2,q3,total;

        Student(String n,String d,int a,int b,int c){
            name=n;
            dept=d;
            q1=a;q2=b;q3=c;
            total=a+b+c;
        }
    }

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();

        List<Student> list=new ArrayList<>();

        for(int i=0;i<n;i++){

            String line=sc.nextLine();
            String[] p=line.split(" ");

            if(p[0].equals("Record")){

                Student s=new Student(
                        p[1],p[2],
                        Integer.parseInt(p[3]),
                        Integer.parseInt(p[4]),
                        Integer.parseInt(p[5])
                );

                list.add(s);

                System.out.println("Record Added: "+p[1]);
            }

            else if(p[0].equals("Top")){

                if(list.isEmpty()){
                    System.out.println("No Records Available");
                    continue;
                }

                if(p[1].startsWith("Q")){

                    int idx=Integer.parseInt(p[1].substring(1));

                    int max=-1;

                    for(Student s:list){
                        int val=(idx==1?s.q1:idx==2?s.q2:s.q3);
                        max=Math.max(max,val);
                    }

                    for(Student s:list){
                        int val=(idx==1?s.q1:idx==2?s.q2:s.q3);
                        if(val==max)
                            System.out.println(s.name+" "+val);
                    }
                }
                else{

                    String dept=p[1];

                    int max=-1;

                    for(Student s:list)
                        if(s.dept.equals(dept))
                            max=Math.max(max,s.total);

                    if(max==-1){
                        System.out.println("Department Not Found");
                        continue;
                    }

                    for(Student s:list)
                        if(s.dept.equals(dept) && s.total==max)
                            System.out.println(s.name+" "+max);
                }
            }
        }
    }
}