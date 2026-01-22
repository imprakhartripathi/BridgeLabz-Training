package insurance_set_based.impl;

import java.time.LocalDate;
import java.util.Objects;

public class Policy implements Comparable<Policy> {

    private final String policyNumber;
    private final String holderName;
    private final LocalDate expiryDate;
    private final String coverageType;
    private final double premium;

    public Policy(String policyNumber,
                  String holderName,
                  LocalDate expiryDate,
                  String coverageType,
                  double premium) {

        this.policyNumber = policyNumber;
        this.holderName = holderName;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premium = premium;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public String getCoverageType() {
        return coverageType;
    }

    @Override
    public int compareTo(Policy other) {
        int cmp = this.expiryDate.compareTo(other.expiryDate);
        if (cmp == 0) {
            return this.policyNumber.compareTo(other.policyNumber);
        }
        return cmp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Policy)) return false;
        Policy policy = (Policy) o;
        return policyNumber.equals(policy.policyNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyNumber);
    }

    @Override
    public String toString() {
        return "Policy{" +
                "number='" + policyNumber + '\'' +
                ", holder='" + holderName + '\'' +
                ", expiry=" + expiryDate +
                ", type='" + coverageType + '\'' +
                '}';
    }
}
