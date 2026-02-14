package disasterrelief;

import disasterrelief.model.*;
import disasterrelief.service.*;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        ReliefService service = new ReliefService();

        ReliefCenter center1 = new ReliefCenter("Center-A");
        center1.addResource("Food", 100);
        center1.addResource("Water", 200);
        center1.addResource("MedicalKit", 50);

        service.addCenter(center1);

        Map<String, Integer> req1 = new HashMap<>();
        req1.put("Food", 20);
        req1.put("Water", 30);

        service.addRequest(new AreaRequest("Area-1", req1));

        Map<String, Integer> req2 = new HashMap<>();
        req2.put("Food", 500);

        service.addRequest(new AreaRequest("Area-2", req2));

        service.allocateResources();
        service.generateReport();
    }
}