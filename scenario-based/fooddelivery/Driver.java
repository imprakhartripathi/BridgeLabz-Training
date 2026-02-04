package fooddelivery;

public class Driver {
    public static void main(String[] args) {
        DeliveryService service = new DeliveryService();

        service.addAgent(new Agent("A1", 10));
        service.addAgent(new Agent("A2", 25));

        service.placeOrder(new Order("O1", 12));
        service.placeOrder(new Order("O2", 30));
//        service.placeOrder(new Order("O3", 20)); // no agents available


        try {
            service.assignOrders();
            service.viewActiveDeliveries();
        } catch (NoAgentAvailableException e) {
            System.out.println(e.getMessage());
        }
    }
}
