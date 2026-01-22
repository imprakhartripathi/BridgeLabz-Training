package insurance_map_based.impl;

import java.time.LocalDate;
import java.util.*;

public class PolicyManager {

    // Primary storage
    private final Map<String, Policy> policyMap = new HashMap<>();

    // Maintain insertion order
    private final Map<String, Policy> insertionOrderMap = new LinkedHashMap<>();

    // Sorted by expiry date
    private final TreeMap<LocalDate, List<Policy>> expiryMap = new TreeMap<>();

    public void addPolicy(Policy policy) {
        policyMap.put(policy.getPolicyNumber(), policy);
        insertionOrderMap.put(policy.getPolicyNumber(), policy);

        expiryMap
                .computeIfAbsent(policy.getExpiryDate(), k -> new ArrayList<>())
                .add(policy);
    }

    public Policy getPolicyByNumber(String policyNumber) {
        return policyMap.get(policyNumber);
    }

    public List<Policy> getPoliciesExpiringWithinDays(int days) {
        LocalDate today = LocalDate.now();
        LocalDate limit = today.plusDays(days);

        List<Policy> result = new ArrayList<>();

        for (Map.Entry<LocalDate, List<Policy>> entry : expiryMap.subMap(today, true, limit, true).entrySet()) {
            result.addAll(entry.getValue());
        }

        return result;
    }

    public List<Policy> getPoliciesByHolder(String holderName) {
        List<Policy> result = new ArrayList<>();

        for (Policy policy : policyMap.values()) {
            if (policy.getPolicyHolder().equalsIgnoreCase(holderName)) {
                result.add(policy);
            }
        }

        return result;
    }

    public void removeExpiredPolicies() {
        LocalDate today = LocalDate.now();

        Iterator<Map.Entry<String, Policy>> iterator = policyMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Policy policy = iterator.next().getValue();
            if (policy.getExpiryDate().isBefore(today)) {
                iterator.remove();
                insertionOrderMap.remove(policy.getPolicyNumber());
            }
        }

        expiryMap.headMap(today, false).clear();
    }

    public void printAllPoliciesInsertionOrder() {
        for (Policy policy : insertionOrderMap.values()) {
            System.out.println(policy);
        }
    }
}
