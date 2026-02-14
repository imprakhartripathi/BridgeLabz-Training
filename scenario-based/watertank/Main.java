package watertank;

import watertank.model.*;
import watertank.exception.*;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<WaterTank> tanks = new ArrayList<>();

        try {
            tanks.add(new WaterTank("T1", 1000, 150));
            tanks.add(new WaterTank("T2", 1000, 800));
            tanks.add(new WaterTank("T3", 1000, 50));
        } catch (InvalidWaterLevelException e) {
            System.out.println(e.getMessage());
        }

        tanks.sort(Comparator.comparingDouble(WaterTank::getCurrentLevel));

        for (WaterTank tank : tanks) {
            System.out.println(tank);
            tank.checkAlert();
        }
    }
}