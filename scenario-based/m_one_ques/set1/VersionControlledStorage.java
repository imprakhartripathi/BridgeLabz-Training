package m_one_ques.set1;

import java.util.*;

public class VersionControlledStorage {

    static class Version{
        String name;
        int size;

        Version(String n,int s){
            name=n;
            size=s;
        }
    }

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();

        Map<String,List<Version>> map=new HashMap<>();

        for(int i=0;i<n;i++){

            String line=sc.nextLine();
            String[] p=line.split(" ");

            switch(p[0]){

                case "UPLOAD":

                    String file=p[1];
                    String version=p[2];
                    int size=Integer.parseInt(p[3]);

                    map.putIfAbsent(file,new ArrayList<>());

                    boolean exists=false;
                    for(Version v:map.get(file))
                        if(v.name.equals(version)) exists=true;

                    if(!exists) map.get(file).add(new Version(version,size));
                    break;

                case "FETCH":

                    file=p[1];

                    if(!map.containsKey(file)){
                        System.out.println("File Not Found");
                        break;
                    }

                    List<Version> list=map.get(file);

                    list.stream()
                            .sorted((a,b)->{
                                if(a.size!=b.size) return a.size-b.size;
                                return a.name.compareTo(b.name);
                            })
                            .forEach(v->System.out.println(file+" "+v.name+" "+v.size));
                    break;

                case "LATEST":

                    file=p[1];

                    if(!map.containsKey(file)){
                        System.out.println("File Not Found");
                        break;
                    }

                    Version latest=map.get(file).get(map.get(file).size()-1);
                    System.out.println(file+" "+latest.name+" "+latest.size);
                    break;

                case "TOTAL_STORAGE":

                    file=p[1];

                    if(!map.containsKey(file)){
                        System.out.println("File Not Found");
                        break;
                    }

                    int sum=0;
                    for(Version v:map.get(file)) sum+=v.size;

                    System.out.println(file+" "+sum);
            }
        }
    }
}