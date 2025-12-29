public class EmployeeWageComputation {

    public static void main(String[] args) {

        final int WAGE_PER_HOUR = 20;
        final int FULL_DAY_HOUR = 8;
        final int PART_TIME_HOUR = 4;
        final int MAX_WORKING_DAYS = 20;
        final int MAX_WORKING_HOURS = 100;

        int totalWorkingDays = 0;
        int totalWorkingHours = 0;
        int totalWage = 0;

        System.out.println("Welcome to Employee Wage Computation Program");
        System.out.println();

        System.out.println("Day\tHours Worked\tDaily Wage");
        System.out.println("-------------------------------------");

        while (totalWorkingDays < MAX_WORKING_DAYS
                && totalWorkingHours < MAX_WORKING_HOURS) {

            totalWorkingDays++;

            int attendance = (int) (Math.random() * 3);

            int dailyHours = switch (attendance) {
                case 1 -> FULL_DAY_HOUR;
                case 2 -> PART_TIME_HOUR;
                default -> 0;
            };

            if (totalWorkingHours + dailyHours > MAX_WORKING_HOURS) {
                dailyHours = MAX_WORKING_HOURS - totalWorkingHours;
            }

            int dailyWage = dailyHours * WAGE_PER_HOUR;

            totalWorkingHours += dailyHours;
            totalWage += dailyWage;

            System.out.printf(
                    "%d\t%d\t\t%d%n",
                    totalWorkingDays,
                    dailyHours,
                    dailyWage
            );
        }

        System.out.println("\n------ Monthly Summary ------");
        System.out.printf("Total Working Days\t: %d%n", totalWorkingDays);
        System.out.printf("Total Working Hours\t: %d%n", totalWorkingHours);
        System.out.printf("Total Monthly Wage\t: %d%n", totalWage);
    }
}
