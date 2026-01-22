package list;

import java.util.*;

public class NthFromEnd {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>(List.of("A", "B", "C", "D", "E"));
        int n = 2;

        String result = findNthFromEnd(list, n);
        System.out.println(result);
    }

    private static <T> T findNthFromEnd(LinkedList<T> list, int n) {

        Iterator<T> fast = list.iterator();
        Iterator<T> slow = list.iterator();

        for (int i = 0; i < n; i++) {
            if (!fast.hasNext()) {
                throw new IllegalArgumentException("N is larger than list size");
            }
            fast.next();
        }

        while (fast.hasNext()) {
            fast.next();
            slow.next();
        }

        return slow.next();
    }
}
