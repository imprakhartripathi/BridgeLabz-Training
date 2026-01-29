package lexicaltwist;

import java.util.Scanner;
import lexicaltwist.impl.LexicalUtil;

public class Driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first word");
        String w1 = sc.nextLine();

        System.out.println("Enter the second word");
        String w2 = sc.nextLine();

        LexicalUtil.process(w1, w2);
        sc.close();
    }
}
