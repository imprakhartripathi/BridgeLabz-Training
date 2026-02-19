package railway;

import railway.model.*;
import railway.service.PlatformAllocationService;
import railway.exp.PlatformUnavailableException;

public class Main {

    public static void main(String[] args) {

        PlatformAllocationService service = new PlatformAllocationService();

        service.addPlatform(new Platform(1));
        service.addPlatform(new Platform(2));

        service.addTrain(new Train("T101", 900));
        service.addTrain(new Train("T202", 830));
        service.addTrain(new Train("T303", 915));

        try {
            service.allocatePlatforms();
        } catch (PlatformUnavailableException e) {
            System.out.println(e.getMessage());
        }
    }
}