package insurance_map_based;

import insurance_map_based.impl.Policy;
import insurance_map_based.impl.PolicyManager;

import java.time.LocalDate;

public class Driver {
    public static void main(String[] args) {

        PolicyManager manager = new PolicyManager();

        manager.addPolicy(new Policy(
                "P1001",
                "Kr$na",
                LocalDate.now().plusDays(20),
                "Health",
                5000
        ));

        manager.addPolicy(new Policy(
                "P1002",
                "Bob",
                LocalDate.now().plusDays(60),
                "Auto",
                3000
        ));

        manager.addPolicy(new Policy(
                "P1003",
                "Kr$na",
                LocalDate.now().minusDays(5),
                "Home",
                8000
        ));

        System.out.println("Policy by number:");
        System.out.println(manager.getPolicyByNumber("P1001"));

        System.out.println("\nExpiring within 30 days:");
        manager.getPoliciesExpiringWithinDays(30)
                .forEach(System.out::println);

        System.out.println("\nPolicies for Kr$na:");
        manager.getPoliciesByHolder("Kr$na")
                .forEach(System.out::println);

        System.out.println("\nRemoving expired policies...");
        manager.removeExpiredPolicies();

        System.out.println("\nAll policies (in insertion order):");
        manager.printAllPoliciesInsertionOrder();
    }
}
