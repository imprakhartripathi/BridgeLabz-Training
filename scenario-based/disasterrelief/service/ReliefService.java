package disasterrelief.service;

import disasterrelief.model.*;
import disasterrelief.exception.*;

import java.util.*;

public class ReliefService {

    private Map<String, ReliefCenter> centers = new HashMap<>();
    private Queue<AreaRequest> requestQueue = new LinkedList<>();

    public void addCenter(ReliefCenter center) {
        centers.put(center.getCenterName(), center);
    }

    public void addRequest(AreaRequest request) {
        requestQueue.offer(request);
    }

    public void allocateResources() {

        while (!requestQueue.isEmpty()) {

            AreaRequest request = requestQueue.poll();
            boolean allocated = false;

            for (ReliefCenter center : centers.values()) {

                try {
                    allocateFromCenter(center, request);
                    System.out.println("Allocated to " + request.getAreaName()
                            + " from " + center.getCenterName());
                    allocated = true;
                    break;

                } catch (InsufficientResourceException ignored) {
                }
            }

            if (!allocated) {
                System.out.println("Allocation failed for " + request.getAreaName());
            }
        }
    }

    private void allocateFromCenter(ReliefCenter center, AreaRequest request)
            throws InsufficientResourceException {

        Map<String, Integer> stock = center.getResources();
        Map<String, Integer> needed = request.getRequestedResources();

        for (String item : needed.keySet()) {
            if (stock.getOrDefault(item, 0) < needed.get(item)) {
                throw new InsufficientResourceException("Not enough " + item);
            }
        }

        for (String item : needed.keySet()) {
            stock.put(item, stock.get(item) - needed.get(item));
        }
    }

    public void generateReport() {
        System.out.println("\n--- Remaining Resources Report ---");
        for (ReliefCenter center : centers.values()) {
            System.out.println(center.getCenterName() + " → " + center.getResources());
        }
    }
}