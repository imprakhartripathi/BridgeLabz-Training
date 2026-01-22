package insurance_map_based.impl;

import java.time.LocalDate;

public class Policy {

    private final String policyNumber;
    private final String policyHolder;
    private final LocalDate expiryDate;
    private final String coverageType;
    private final double premium;

    public Policy(String policyNumber,
                  String policyHolder,
                  LocalDate expiryDate,
                  String coverageType,
                  double premium) {

        this.policyNumber = policyNumber;
        this.policyHolder = policyHolder;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premium = premium;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public String getPolicyHolder() {
        return policyHolder;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public String getCoverageType() {
        return coverageType;
    }

    public double getPremium() {
        return premium;
    }

    @Override
    public String toString() {
        return "Policy{" +
                "number='" + policyNumber + '\'' +
                ", holder='" + policyHolder + '\'' +
                ", expiry=" + expiryDate +
                ", type='" + coverageType + '\'' +
                ", premium=" + premium +
                '}';
    }
}
