package stringbuffer;

import java.util.Arrays;

public class StringBufferConcatenate {
    public static void main(String[] args) {
        String[] arr = {"Java", " ", "is", " ", "fast"};
        System.out.print("Original Array: " + Arrays.toString(arr));
        StringBuffer sb = new StringBuffer();

        for (String s : arr) {
            sb.append(s);
        }
        System.out.println("\nOutput: " + sb.toString());
    }
}
