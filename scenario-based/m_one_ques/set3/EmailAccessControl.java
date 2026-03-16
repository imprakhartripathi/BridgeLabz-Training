package m_one_ques.set3;

import java.util.*;
import java.util.regex.*;

public class EmailAccessControl {

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();

        Pattern pattern = Pattern.compile(
                "^[a-z]{3,}\\.[a-z]{3,}\\d{4,}@(sales|marketing|IT|product)\\.company\\.com$"
        );

        for(int i=0;i<n;i++){

            String email=sc.nextLine();

            if(pattern.matcher(email).matches())
                System.out.println("Access Granted");
            else
                System.out.println("Access Denied");
        }
    }
}