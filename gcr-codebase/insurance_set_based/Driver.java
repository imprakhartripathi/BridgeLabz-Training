package insurance_set_based;

import insurance_set_based.impl.*;

import java.time.LocalDate;
import java.util.*;

public class Driver {
    public static void main(String[] args) {

        PolicyStore store = new PolicyStore();

        store.addPolicy(new Policy("P1", "Akshay", LocalDate.now().plusDays(10), "Health", 5000));
        store.addPolicy(new Policy("P2", "Ranbir", LocalDate.now().plusDays(40), "Auto", 3000));
        store.addPolicy(new Policy("P3", "John", LocalDate.now().plusDays(20), "Health", 4000));

        System.out.println("All unique policies:");
        store.getAllUniquePolicies().forEach(System.out::println);

        System.out.println("\nExpiring within 30 days:");
        store.getPoliciesExpiringWithinDays(30).forEach(System.out::println);

        System.out.println("\nHealth policies:");
        store.getPoliciesByCoverage("Health").forEach(System.out::println);

        System.out.println("\nInsertion order:");
        store.getInsertionOrderPolicies().forEach(System.out::println);

        System.out.println("\nExpiry sorted:");
        store.getExpirySortedPolicies().forEach(System.out::println);

        System.out.println("\nPerformance comparison:");
        PerformanceTest.test(new HashSet<>(), "HashSet");
        PerformanceTest.test(new LinkedHashSet<>(), "LinkedHashSet");
        PerformanceTest.test(new TreeSet<>(), "TreeSet");
    }
}
