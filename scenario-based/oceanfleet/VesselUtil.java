package oceanfleet;

import java.util.*;

public class VesselUtil {

    private List<Vessel> vesselList = new ArrayList<>();

    public void addVesselPerformance(Vessel vessel) {
        vesselList.add(vessel);
    }

    public Vessel getVesselById(String vesselId) {
        for (Vessel v : vesselList) {
            if (v.getVesselId().equals(vesselId)) {
                return v;
            }
        }
        return null;
    }

    public List<Vessel> getHighPerformanceVessels() {
        List<Vessel> result = new ArrayList<>();
        double maxSpeed = 0;

        for (Vessel v : vesselList) {
            maxSpeed = Math.max(maxSpeed, v.getAverageSpeed());
        }

        for (Vessel v : vesselList) {
            if (v.getAverageSpeed() == maxSpeed) {
                result.add(v);
            }
        }
        return result;
    }
}
