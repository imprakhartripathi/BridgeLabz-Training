import java.util.HashSet;
import java.util.Scanner;

public class ContainsDuplicate {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter array size: ");
            int n = sc.nextInt();
            
            int[] arr = new int[n];
            System.out.println("Enter elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            HashSet<Integer> set = new HashSet<>();
            boolean hasDuplicate = false;
            
            for (int num : arr) {
                if (set.contains(num)) {
                    hasDuplicate = true;
                    break;
                }
                set.add(num);
            }
            
            System.out.println(hasDuplicate);
        }
    }
}
