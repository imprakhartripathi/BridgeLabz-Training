package robothazard;

import robothazard.impl.RobotHazardAuditor;
import robothazard.impl.RobotSafetyException;

import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        RobotHazardAuditor auditor = new RobotHazardAuditor();

        try {
            System.out.print("Enter Arm Precision (0.0 - 1.0): ");
            double armPrecision = sc.nextDouble();

            System.out.print("Enter Worker Density (1 - 20): ");
            int workerDensity = sc.nextInt();
            sc.nextLine(); // consume newline

            System.out.print("Enter Machinery State (Worn/Faulty/Critical): ");
            String machineryState = sc.nextLine();

            double risk = auditor.CalculateHazardRisk(
                    armPrecision,
                    workerDensity,
                    machineryState
            );

            System.out.println("Robot Hazard Risk Score: " + risk);

        } catch (RobotSafetyException e) {
            System.out.println(e.getMessage());
        }
    }
}
