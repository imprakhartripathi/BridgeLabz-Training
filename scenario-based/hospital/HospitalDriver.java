package hospital;

import hospital.impl.*;
import java.util.Scanner;

public class HospitalDriver {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("1. InPatient");
            System.out.println("2. OutPatient");
            System.out.print("Select Patient Type: ");
            int choice = sc.nextInt();
            
            System.out.print("Enter Patient ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            
            System.out.print("Enter Patient Name: ");
            String name = sc.nextLine();
            
            Patient patient;
            
            if (choice == 1) {
                System.out.print("Enter No. of Days: ");
                int days = sc.nextInt();
                System.out.print("Enter Daily Charge: ");
                double charge = sc.nextDouble();
                
                patient = new InPatient(id, name, days, charge);
            } else {
                System.out.print("Enter Consultation Fee: ");
                double fee = sc.nextDouble();
                
                patient = new OutPatient(id, name, fee);
            }
            
            patient.displayInfo();
        }
    }
}
