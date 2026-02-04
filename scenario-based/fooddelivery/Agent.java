package fooddelivery;

public class Agent {
    private final String agentId;
    private final int location;
    private boolean available = true;

    public Agent(String agentId, int location) {
        this.agentId = agentId;
        this.location = location;
    }

    public boolean isAvailable() {
        return available;
    }

    public void assign() {
        this.available = false;
    }

    public void release() {
        this.available = true;
    }

    public int distanceFrom(int orderLocation) {
        return Math.abs(this.location - orderLocation);
    }

    public String getAgentId() {
        return agentId;
    }
}
