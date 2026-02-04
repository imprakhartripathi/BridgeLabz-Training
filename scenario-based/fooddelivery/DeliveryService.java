package fooddelivery;

import java.util.*;

public class DeliveryService {

    private final Queue<Order> orders = new LinkedList<>();
    private final List<Agent> agents = new ArrayList<>();
    private final Map<String, String> activeDeliveries = new HashMap<>();

    public void addAgent(Agent agent) {
        agents.add(agent);
    }

    public void placeOrder(Order order) {
        orders.offer(order);
    }

    public void assignOrders() throws NoAgentAvailableException {
        while (!orders.isEmpty()) {
            Order order = orders.peek();

            Agent nearest = agents.stream()
                    .filter(Agent::isAvailable)
                    .min(Comparator.comparingInt(a -> a.distanceFrom(order.getLocation())))
                    .orElseThrow(() -> new NoAgentAvailableException("No agents available"));

            nearest.assign();
            activeDeliveries.put(order.getOrderId(), nearest.getAgentId());
            orders.poll();
        }
    }

    public void cancelOrder(String orderId) {
        activeDeliveries.remove(orderId);
    }

    public void viewActiveDeliveries() {
        activeDeliveries.forEach((o, a) ->
                System.out.println("Order " + o + " assigned to Agent " + a));
    }
}
