package list;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(List.of(3, 1, 2, 2, 3, 4));

        Set<Integer> seen = new HashSet<>();
        List<Integer> result = new ArrayList<>();

        for (Integer value : list) {
            if (seen.add(value)) {
                result.add(value);
            }
        }

        System.out.println(result);
    }
}
