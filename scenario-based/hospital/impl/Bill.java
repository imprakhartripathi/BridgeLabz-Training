package hospital.impl;

public class Bill {
    public static void generate(IPayable payable) {
        System.out.println("Total Bill: " + payable.calculateBill());
    }
}
