/*
Program:
Calculate bonus for 10 employees of Zara based on years of service
and display old salary, new salary, bonus amount, and totals.

Bonus Rules:
- More than 5 years of service = 5% bonus
- 5 years or less = 2% bonus
*/

public class ZaraBonusCalculator {

    // Method to generate old salary and years of service
    // Column 0 = Old Salary
    // Column 1 = Years of Service
    public static double[][] generateEmployeeData(int employees) {

        double[][] data = new double[employees][2];

        for (int i = 0; i < employees; i++) {
            // 5 digit salary between 10000 and 99999
            data[i][0] = (int) (Math.random() * 90000) + 10000;

            // Years of service between 1 and 10
            data[i][1] = (int) (Math.random() * 10) + 1;
        }
        return data;
    }

    // Method to calculate bonus and new salary
    // Column 0 = Old Salary
    // Column 1 = Years of Service
    // Column 2 = Bonus Amount
    // Column 3 = New Salary
    public static double[][] calculateBonus(double[][] data) {

        double[][] result = new double[data.length][4];

        for (int i = 0; i < data.length; i++) {
            double oldSalary = data[i][0];
            double years = data[i][1];
            double bonusRate;

            if (years > 5) {
                bonusRate = 0.05;
            } else {
                bonusRate = 0.02;
            }

            double bonus = oldSalary * bonusRate;
            double newSalary = oldSalary + bonus;

            result[i][0] = oldSalary;
            result[i][1] = years;
            result[i][2] = bonus;
            result[i][3] = newSalary;
        }
        return result;
    }

    // Method to calculate and display totals in tabular format
    public static void displaySummary(double[][] result) {

        double totalOldSalary = 0;
        double totalBonus = 0;
        double totalNewSalary = 0;

        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Emp\tOld Salary\tYears\tBonus\t\tNew Salary");
        System.out.println("--------------------------------------------------------------------------");

        for (int i = 0; i < result.length; i++) {
            System.out.printf("%d\t%.2f\t%.0f\t%.2f\t\t%.2f%n",
                    (i + 1),
                    result[i][0],
                    result[i][1],
                    result[i][2],
                    result[i][3]);

            totalOldSalary += result[i][0];
            totalBonus += result[i][2];
            totalNewSalary += result[i][3];
        }

        System.out.println("--------------------------------------------------------------------------");
        System.out.printf("TOTAL\t%.2f\t\t%.2f\t\t%.2f%n",
                totalOldSalary, totalBonus, totalNewSalary);
        System.out.println("--------------------------------------------------------------------------");
    }

    public static void main(String[] args) {

        int employees = 10;

        double[][] employeeData = generateEmployeeData(employees);
        double[][] finalResult = calculateBonus(employeeData);
        displaySummary(finalResult);
    }
}
