package futurelogistics;

import java.util.Scanner;
import futurelogistics.impl.*;

public class Driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Goods Transport details");
        String input = sc.nextLine();

        GoodsTransport gt = Utility.parseDetails(input);
        if (gt != null) {
            System.out.println("Vehicle for transport : " + gt.vehicleSelection());
            System.out.println("Total charge : " + gt.calculateTotalCharge());
        }
        sc.close();
    }
}
