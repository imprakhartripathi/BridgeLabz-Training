package cleanseinvert;

import java.util.Scanner;
import cleanseinvert.impl.StringUtil;

public class Driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word");
        String input = sc.nextLine();

        StringUtil util = new StringUtil();
        String result = util.cleanseAndInvert(input);

        if (result.isEmpty()) {
            System.out.println("Invalid Input");
        } else {
            System.out.println("The generated key is - " + result);
        }
        sc.close();
    }
}
