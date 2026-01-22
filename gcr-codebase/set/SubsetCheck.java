package set;

import java.util.*;

public class SubsetCheck {
    public static void main(String[] args) {

        Set<Integer> subset = new HashSet<>(Set.of(2, 3));
        Set<Integer> superset = new HashSet<>(Set.of(1, 2, 3, 4));

        boolean isSubset = superset.containsAll(subset);
        System.out.println(isSubset);
    }
}
