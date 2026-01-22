package list;

import java.util.*;

public class ReverseList {
    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        reverse(arrayList);
        System.out.println("ArrayList reversed: " + arrayList);

        List<Integer> linkedList = new LinkedList<>(List.of(1, 2, 3, 4, 5));
        reverse(linkedList);
        System.out.println("LinkedList reversed: " + linkedList);
    }

    private static <T> void reverse(List<T> list) {
        int left = 0;
        int right = list.size() - 1;

        while (left < right) {
            T temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);
            left++;
            right--;
        }
    }
}
