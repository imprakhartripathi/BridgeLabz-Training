package m_one_ques.set1;

import java.util.*;
import java.util.regex.*;
import java.time.*;

public class ShipmentManifestValidator {

    static boolean validateCode(String code){
        if(!code.matches("SHIP-[1-9][0-9]{5}")) return false;

        String digits = code.substring(5);
        int count=1;

        for(int i=1;i<digits.length();i++){
            if(digits.charAt(i)==digits.charAt(i-1)){
                count++;
                if(count>3) return false;
            }else count=1;
        }
        return true;
    }

    static boolean validateDate(String date){
        try{
            LocalDate d = LocalDate.parse(date);
            return d.getYear()>=2000 && d.getYear()<=2099;
        }catch(Exception e){
            return false;
        }
    }

    static boolean validateMode(String mode){
        return Set.of("AIR","SEA","ROAD","RAIL","EXPRESS","FREIGHT").contains(mode);
    }

    static boolean validateWeight(String w){
        try{
            if(!w.matches("(0|[1-9][0-9]{0,5})(\\.[0-9]{1,2})?")) return false;
            double val = Double.parseDouble(w);
            return val>=0 && val<=999999.99;
        }catch(Exception e){
            return false;
        }
    }

    static boolean validateStatus(String s){
        return Set.of("DELIVERED","CANCELLED","IN_TRANSIT").contains(s);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();

        for(int i=0;i<n;i++){

            String line=sc.nextLine();
            String[] parts=line.split("\\|");

            boolean valid = parts.length==5
                    && validateCode(parts[0])
                    && validateDate(parts[1])
                    && validateMode(parts[2])
                    && validateWeight(parts[3])
                    && validateStatus(parts[4]);

            System.out.println(valid?"COMPLIANT RECORD":"NON-COMPLIANT RECORD");
        }
    }
}