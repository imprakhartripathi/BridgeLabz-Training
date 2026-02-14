package watertank.model;

import watertank.exception.InvalidWaterLevelException;

public class WaterTank {

    private String tankId;
    private double capacity;
    private double currentLevel;

    public WaterTank(String tankId, double capacity, double currentLevel)
            throws InvalidWaterLevelException {

        if (currentLevel > capacity) {
            throw new InvalidWaterLevelException("Level exceeds capacity");
        }

        this.tankId = tankId;
        this.capacity = capacity;
        this.currentLevel = currentLevel;
    }

    public double getUsagePercentage() {
        return (currentLevel / capacity) * 100;
    }

    public void checkAlert() {
        if (getUsagePercentage() < 20) {
            System.out.println("ALERT: Tank " + tankId + " below 20%");
        }
    }

    public String getTankId() {
        return tankId;
    }

    public double getCurrentLevel() {
        return currentLevel;
    }

    @Override
    public String toString() {
        return tankId + " = " + getUsagePercentage() + "%";
    }
}