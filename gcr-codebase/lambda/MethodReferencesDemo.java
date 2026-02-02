package lambda;

import java.util.*;
import java.util.stream.Collectors;

public class MethodReferencesDemo {

    static class Invoice {
        String transactionId;

        Invoice(String transactionId) {
            this.transactionId = transactionId;
        }

        @Override
        public String toString() {
            return "Invoice generated for TXN: " + transactionId;
        }
    }

    public static void main(String[] args) {

        System.out.println("=== Method References Demo ===");

        // 1. Printing Patient IDs
        List<Integer> patientIds = List.of(101, 102, 103);
        System.out.println("\nPatient IDs:");
        patientIds.forEach(System.out::println);

        // 2. Uppercasing names
        List<String> employees = List.of("rahul", "neha", "amit");
        System.out.println("\nEmployee Names (Uppercase):");
        employees.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

        // 3. Constructor reference
        List<String> txns = List.of("TXN1001", "TXN1002");
        List<Invoice> invoices = txns.stream()
                .map(Invoice::new)
                .collect(Collectors.toList());

        System.out.println("\nGenerated Invoices:");
        invoices.forEach(System.out::println);
    }
}
