package disasterrelief.model;

import java.util.HashMap;
import java.util.Map;

public class ReliefCenter {

    private String centerName;
    private Map<String, Integer> resources = new HashMap<>();

    public ReliefCenter(String centerName) {
        this.centerName = centerName;
    }

    public void addResource(String item, int quantity) {
        resources.put(item, resources.getOrDefault(item, 0) + quantity);
    }

    public Map<String, Integer> getResources() {
        return resources;
    }

    public String getCenterName() {
        return centerName;
    }
}