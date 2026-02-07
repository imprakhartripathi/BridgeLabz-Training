package oceanfleet;

import java.util.*;

public class UserInterface {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        VesselUtil util = new VesselUtil();

        System.out.println("========================================");
        System.out.println("        OCEANFLEET VESSEL ANALYTICS      ");
        System.out.println("========================================\n");

        System.out.print("Enter the number of vessels to be added: ");
        int n = Integer.parseInt(sc.nextLine());

        System.out.println("\n----------------------------------------");
        System.out.println("Enter vessel details in the format:");
        System.out.println("vesselId:vesselName:averageSpeed:vesselType");
        System.out.println("Example: V001:Sea King:25.5:Cargo");
        System.out.println("----------------------------------------");

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter details for vessel " + i + ": ");
            String[] data = sc.nextLine().split(":");

            util.addVesselPerformance(
                    new Vessel(
                            data[0],
                            data[1],
                            Double.parseDouble(data[2]),
                            data[3]
                    )
            );
        }

        System.out.println("\n========================================");
        System.out.print("Enter the Vessel Id to check performance: ");
        String id = sc.nextLine();

        System.out.println("\n---------- Vessel Details ---------------");

        Vessel v = util.getVesselById(id);
        if (v != null) {
            System.out.println("Vessel ID      : " + v.getVesselId());
            System.out.println("Vessel Name    : " + v.getVesselName());
            System.out.println("Vessel Type    : " + v.getVesselType());
            System.out.println("Average Speed  : " + v.getAverageSpeed() + " knots");
        } else {
            System.out.println("Vessel Id '" + id + "' not found.");
        }

        System.out.println("\n========================================");
        System.out.println("        HIGH PERFORMANCE VESSELS         ");
        System.out.println("========================================");

        List<Vessel> highPerf = util.getHighPerformanceVessels();

        if (highPerf.isEmpty()) {
            System.out.println("No vessel performance data available.");
        } else {
            for (Vessel hv : highPerf) {
                System.out.println(
                        hv.getVesselId() + " | " +
                                hv.getVesselName() + " | " +
                                hv.getVesselType() + " | " +
                                hv.getAverageSpeed() + " knots"
                );
            }
        }

        System.out.println("\n========================================");
        System.out.println("Thank you for using OceanFleet Analytics");
        System.out.println("========================================");
    }
}
