package insurance_set_based.impl;

import java.time.LocalDate;
import java.util.*;

public class PolicyStore {

    private final Set<Policy> hashSet = new HashSet<>();
    private final Set<Policy> linkedHashSet = new LinkedHashSet<>();
    private final Set<Policy> treeSet = new TreeSet<>();

    public void addPolicy(Policy policy) {
        hashSet.add(policy);
        linkedHashSet.add(policy);
        treeSet.add(policy);
    }

    public Set<Policy> getAllUniquePolicies() {
        return hashSet;
    }

    public List<Policy> getPoliciesExpiringWithinDays(int days) {
        LocalDate today = LocalDate.now();
        LocalDate limit = today.plusDays(days);

        List<Policy> result = new ArrayList<>();

        for (Policy policy : treeSet) {
            if (!policy.getExpiryDate().isBefore(today) &&
                    !policy.getExpiryDate().isAfter(limit)) {
                result.add(policy);
            }
        }
        return result;
    }

    public List<Policy> getPoliciesByCoverage(String coverageType) {
        List<Policy> result = new ArrayList<>();

        for (Policy policy : hashSet) {
            if (policy.getCoverageType().equalsIgnoreCase(coverageType)) {
                result.add(policy);
            }
        }
        return result;
    }

    public Set<String> findDuplicatePolicyNumbers(List<Policy> input) {
        Set<String> seen = new HashSet<>();
        Set<String> duplicates = new HashSet<>();

        for (Policy policy : input) {
            if (!seen.add(policy.getPolicyNumber())) {
                duplicates.add(policy.getPolicyNumber());
            }
        }
        return duplicates;
    }

    public Set<Policy> getInsertionOrderPolicies() {
        return linkedHashSet;
    }

    public Set<Policy> getExpirySortedPolicies() {
        return treeSet;
    }
}
