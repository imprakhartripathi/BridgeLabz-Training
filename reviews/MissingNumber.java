
import java.util.Arrays;
import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int size = sc.nextInt();
            int[] arr = new int[size];
            System.out.println("Please Enter the array below in a sequence with one missing in between");
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr); // just sorting it because sometimes people make mistakes

            int start = arr[0];
            int end = arr[size - 1];
            int x = start;

            int[] newarr = new int[size + 1];
            while (x != end) {
                for (int i = 0; i < size; i++) {
                    newarr[i] = x;
                    x++;
                }
            }

            for(int i=0; i<size; i++){
                if(arr[i] != newarr[i]){
                    System.out.println("Missing no is " + newarr[i]);
                    break;
                }
                
            }
        }

    }
}
