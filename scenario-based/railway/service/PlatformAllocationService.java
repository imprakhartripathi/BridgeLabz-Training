package railway.service;

import railway.model.*;
import railway.exp.PlatformUnavailableException;

import java.util.*;

public class PlatformAllocationService {

    private Map<Integer, Platform> platformMap = new TreeMap<>();
    private PriorityQueue<Train> incomingTrains = new PriorityQueue<>();

    public void addPlatform(Platform platform) {
        platformMap.put(platform.getPlatformNumber(), platform);
    }

    public void addTrain(Train train) {
        incomingTrains.offer(train);
    }

    public void allocatePlatforms() throws PlatformUnavailableException {

        while (!incomingTrains.isEmpty()) {

            Train train = incomingTrains.poll();

            Platform platform = platformMap.values()
                    .stream()
                    .filter(Platform::isAvailable)
                    .findFirst()
                    .orElseThrow(() ->
                            new PlatformUnavailableException(
                                    "No platform available for train "
                                            + train.getTrainNumber()));

            platform.setAvailable(false);

            System.out.println("Train " + train.getTrainNumber()
                    + " allocated to Platform "
                    + platform.getPlatformNumber());

            // After departure platform is free again
            platform.setAvailable(true);
        }
    }
}